package com.javassem.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javassem.domain.MemberVO;
import com.javassem.service.MemberService;

@Controller
@RequestMapping("user")
public class MemberController {

	@Autowired	// memberService 주입
	private MemberService memberService;
	
	// 가입하기
	@RequestMapping("{url}.do")
	public String userJoin(@PathVariable String url) {
			System.out.println("확인");
			return "/user/" + url;
	}
	
	/*
	 *	요청: /user/userInsert.do
	 * 뷰페이지: user/userJoin_ok.jsp
	 */
	@RequestMapping("userInsert.do")
	public ModelAndView userInsert(MemberVO memberVO) { // ModelAndView 사용
		System.out.println(memberVO.getUserName()); 			// 값 넘기면 받아올 수 있는지 확인
		
		int result = memberService.userInsert(memberVO);
		String message = "가입되지 않았습니다.";
		if(result==1) message = memberVO.getUserName() +"님 가입을 축하합니다."; // 입력될 경우 1(정상 처리)
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/userJoin_ok");
		mv.addObject("message", message); // 화면으로 메시지 값 넘기기 (뷰페이지로)
		return mv;
	}
	
	@RequestMapping("login.do")
	//*********************************
	// 세션 사용 > 인자에 HttpSession 변수 선언
	public String login(MemberVO vo, HttpSession session) {
		
		MemberVO result = memberService.idCheck_Login(vo);
		if(result== null || result.getUserId()==null) {
			return "/user/userLogin";
		}else {
			// 로그인 성공
			// 세션에 저장
			session.setAttribute("login", vo.getUserId());
			
			return "/user/login_ok";
		}
	} // end of login
	
	
	@RequestMapping(value="idCheck.do", produces = "application/text;charset=utf-8")
	// ****************************************************************************************************************************
	// 일반 요청 함수에서 String 리턴: 뷰페이지 지정
	// 		이 요청에 Ajax 통신에 의해 값을 전송해야함 (화면 바꾸지 않응려고 Ajax 사용하기때문에)
	
	@ResponseBody
	public String checkId(MemberVO vo) {
				
			System.out.println("idCheck.do 요청: " + vo.getUserId());	// 중간 확인
			
			MemberVO result = memberService.idCheck_Login(vo);
			String message = "사용 가능한 아이디입니다.";
			if(result!=null) message = "중복된 아이디가 있습니다.";
			
			System.out.println("message: " + message);
			
			return message;
	} // end of checkId()
	
}

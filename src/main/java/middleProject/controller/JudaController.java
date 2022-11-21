package middleProject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import middleProject.domain.LoginVO;
import middleProject.service.JudaService;

@Controller
public class JudaController {

	 @RequestMapping("{url}.do") public String userJoin(@PathVariable String url)
	 { System.out.println("확인"); return url; }
	 
	 @Autowired
	 private JudaService judaService;
	 
	 
	 // 로그인 post
	 @RequestMapping("login_check.do")
	 public String selectAllLogin(LoginVO vo, HttpSession session) {
		 
		 System.out.println(vo);
		 
		 Integer result = judaService.selectAllLogin(vo);
		 
		 System.out.println(result);		 
		 
		 if(result == 1) {
			 
			 session.setAttribute("id",  vo.getMember_id() );
			 
		return "index";
		
		 }else { // 로그인 실패 시
			 return "loginForm";
		 } // end of else() 
		 
	 } // end of selectAllLogin()
	
	 
	 // 로그아웃
//	 @GetMapping("logout")
//	 public void logout() throws Exception{}
//	 
//	 @PostMapping("logout")
//	 public String logout(LoginVO loginVO, HttpSession session) throws Exception{
//			return "logout";
//		}
//	
//
//	  @RequestMapping("index.do") public void index() {
//	  System.out.println("index.do 실행"); }
//	  
//	  
//	  @RequestMapping("intro.do") public void intro() {
//	  System.out.println("intro.do 실행"); }
//	  
//	  
//	  @RequestMapping("intro.do") public void goodsList() {
//	  System.out.println("goodsList.do 실행"); }
	 
	
}

//	 // 01. 로그인 화면
//	 @RequestMapping("login.do")
//	 public String login() {
//		 return "login";	// views/login.jsp로 이동
//	 }
//	 
//	 // 02. 로그인 처리
//	 @RequestMapping
//	public ModelAndView loginCheck(@ModelAttribute LoginVO vo, HttpHttpSession session) {
//		 boolean result = judaService.loginCheck(vo, session);
//		 ModelAndView mav = new ModelAndView();
//		 if(result == true) { // 로그인 성공 시 
//			 // index.jsp로 이동 (메인)
//			 mav.setViewName("home");
//			 mav.addObject("msg", "success");
//		 }else { // 로그인 실패 시 
//			 // login.jsp로 이동
//		 }
//	 }
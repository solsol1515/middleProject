package middleProject.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import middleProject.dao.JudaDAO;
import middleProject.domain.LoginVO;

@Service("judaService")
public class JudaServiceImpl implements JudaService{

	@Autowired
	private JudaDAO judaDAO;
	
	//	아이디 중복 체크 sql + 로그인 기능 sql
	public Integer selectAllLogin(LoginVO vo) {
		return judaDAO.selectAllLogin(vo);
	} // end of selectAllLogin()
	
	
	public Integer selectAllLogin(LoginVO vo, HttpSession session) {
		Integer name = judaDAO.selectAllLogin(vo);
		if(name != null) { // 세션 변수 저장
			session.setAttribute("id", vo.getMember_id());
			session.setAttribute("name", name);
		}
		return name;
	}
	
	
	@Override
	public void logout(HttpSession session) {
		session.invalidate(); // 세션 초기화
	}


	@Override
	public boolean loginCheck(LoginVO vo, HttpSession session) {
		return false;
	}
}

//	// 01_01. 회원 로그인 체크
//	@Override
//	public boolean loginCheck(LoginVO vo, HttpSession session) {
//		boolean result = judaDAO.loginCheck(vo);
//		if(result) { // true일 경우 세션에 등록
//			LoginVO vo2 = viewMember(vo);
//			// 세션 변수 등록
//			session.setAttribute("member_id", vo2.getMember_id());
//			session.setAttribute("password", vo2.getPassword());
//		}
//		return result;
//	}
//	// 01_02. 회원 로그인 정보
//	@Override
//	public LoginVO viewMember(LoginVO vo) {
//		return judaDAO.viewMember(vo);
//	}
//	
//	// 02. 회원 로그아웃
//	@Override
//	public void logout (HttpSession session) {
//		// 세션 변수 개별 삭제
//		// session.removeAttribute("member_id");
//		// 세션 정보 초기화
//		session.invalidate();
//	}
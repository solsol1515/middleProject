package middleProject.service;

<<<<<<< HEAD
import javax.servlet.http.HttpSession;

import middleProject.domain.LoginVO;

public interface JudaService {

	
// 로그인
	public Integer selectAllLogin (LoginVO vo);
	
	// 로그아웃?
	public void logout (HttpSession session);
	
//	Integer selectAllLogin(LoginVO vo, HttpSession session);
	
//	public boolean loginCheck(LoginVO vo, HttpSession session);

	Integer selectAllLogin(LoginVO vo, HttpSession session);

	boolean loginCheck(LoginVO vo, HttpSession session); 
}


//	// 01_01. 회원 로그인 체크
//	public Integer selectAllLogin(LoginVO vo, HttpSession session);
//	
//	// 01_02. 회원 로그인 정보
//	public LoginVO viewMember(LoginVO vo);
//	
//	// 02. 회원 로그아웃
//	public void logout(HttpSession session);
=======
public interface JudaService {

}
>>>>>>> 87a9c1b58909d2a0468378e6d55cf909113303da

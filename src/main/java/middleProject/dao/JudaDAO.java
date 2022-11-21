package middleProject.dao;

import javax.servlet.http.HttpSession;

import middleProject.domain.LoginVO;

public interface JudaDAO {
	
// 위의 방법 안되면 다시 되돌리기###
//	// 로그인
	public int selectAllLogin(LoginVO vo) ;
		LoginVO idCheck(LoginVO vo);
}

//	// 01_01. 회원 로그인 체크
//	public boolean loginCheck(LoginVO vo);
//	
//	// 01_02. 회원 로그인 정보
//	public LoginVO viewMember(LoginVO vo);
//	
//	// 02. 회원 로그아웃
//	public void logout(HttpSession session);
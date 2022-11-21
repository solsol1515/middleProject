package middleProject.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import middleProject.domain.LoginVO;

@Repository("judaDAO") // 현재 클래스 fmf dao bean으로 등록
public class JudaDAOImpl implements JudaDAO {
	
//	private SqlSessionTemplate mybatis; 아래 방법 해보고 안되면 다시 살리기 ###
	
	@Autowired // SqlSession 의존관계 주입하기
	SqlSession sqlSession; // mybatis 실행 객체

	@Override
	public int selectAllLogin(LoginVO vo) {
		return sqlSession.selectOne("member.selectAllLogin", vo);
	}

	@Override
	public LoginVO idCheck(LoginVO vo) {
		return null;
	}
	
}
	
//	// 로그인 ###
//	public Integer selectAllLogin(LoginVO vo) {
//		return sqlSession.selectOne("member.selectAllLogin", vo);
//	}
	
//	// 01_01. 회원 로그인 체크
//	@Override
//	public boolean loginCheck(LoginVO vo) {
//		String name = sqlSession.selectOne("loginCheck", vo);
//		return (name == null) ? false : true;
//	}
//
//	// 01_02. 회원 로그인 정보
//	@Override
//	public LoginVO viewMember(LoginVO vo) {
//		return sqlSession.selectOne("viewMember", vo);
//	}
//
//	@Override
//	public void logout(HttpSession session) {
//	}


package test.com.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	MemberDAO dao;
	
	public int insert(MemberVO vo) {
		return dao.insert(vo);
	}
	
	public MemberVO login(MemberVO vo) {
		return dao.login(vo);
	}

}

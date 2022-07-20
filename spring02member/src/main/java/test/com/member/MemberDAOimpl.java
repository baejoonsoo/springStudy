package test.com.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOimpl implements MemberDAO {
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOimpl.class);
	
	@Override
	public int insert(MemberVO vo) {
		logger.info("insert()...");
		logger.info("vo:{}",vo);
		return 1;
	}
	
	@Override
	public MemberVO login(MemberVO vo) {
		logger.info("login()...");
		logger.info("vo:{}",vo);
		return vo;
	}
	
}

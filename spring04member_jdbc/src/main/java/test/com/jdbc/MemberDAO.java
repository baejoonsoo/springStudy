package test.com.jdbc;

public interface MemberDAO {
	public int insert(MemberVO vo);
	public MemberVO login(MemberVO vo);
}

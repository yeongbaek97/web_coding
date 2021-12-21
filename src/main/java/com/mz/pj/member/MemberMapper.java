package com.mz.pj.member;

import java.util.List;

public interface MemberMapper {

	public Member getMemberByID(Member m);

	public int join(Member m);

	public int bye(Member m);

	public int update(Member m);

	public List<Member> getMemberByID2(Member m);

}

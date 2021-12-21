package com.mz.pj.sns;

import java.util.List;

import com.mz.pj.member.Member;

public interface SNSMapper {

	public abstract int deleteMsg(SNSMsg sm);
	public abstract int deleteReply(SNSReply sr);
	public abstract List<SNSMsg> getMsg(SNSSelector sSel);
	public abstract Integer getMsgCount(SNSSelector sSel);
	public abstract Integer getMsgCountByOwner(Member m);
	public abstract List<SNSReply> getReply(SNSMsg sm);
	public abstract int updateMsg(SNSMsg sm);
	public abstract int writeMsg(SNSMsg sm);
	public abstract int writeReply(SNSReply sr);

}

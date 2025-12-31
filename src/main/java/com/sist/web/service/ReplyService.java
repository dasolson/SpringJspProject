package com.sist.web.service;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import com.sist.web.vo.ReplyVO;

public interface ReplyService {
	/*
	 * @Select("SELECT no, cno, type, name, id, msg, TO_CHAR(regdate, 'yyyy-mm-dd HH24:mi:ss') as dbday "
				+ "FROM comment_3 "
				+ "WHERE cno=#{cno} AND type=#{type}")
	*/
	public List<ReplyVO> replyListData(int cno, int type);
	/*
		@Insert("INSERT INTO comment_3 VALUES("
				+ "SELECT NVL(MAX(no)+1, 1) FROM comment_3) "
				+ "#{cno}, #{type}, #{id}, #{name}, #{msg}, SYSDATE)")
	*/
	public void replyInsert(ReplyVO vo);
	public void replyDelete(int no);
	public void replyUpdate(ReplyVO vo);
	 
}

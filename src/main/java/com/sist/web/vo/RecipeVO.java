package com.sist.web.vo;

import lombok.Data;

/*
 *  NO			NUMBER(38,0)
	TITLE		VARCHAR2(4000 BYTE)
	POSTER		VARCHAR2(4000 BYTE)
	CHEF		VARCHAR2(4000 BYTE)
	LINK		VARCHAR2(26 BYTE)
	HIT			NUMBER(38,0)
	LIKECOUNT	NUMBER(38,0)
	JJIMCOUNT	NUMBER(38,0)
	REPLYCOUNT	NUMBER(38,0)
 */
@Data
public class RecipeVO {
	private int no, hit, likecount, jjimcount, replycount;
	//                   ================================= 자동 증가 : 트리거 : 다른 테이블 연결시에만 사용이 가능
	//                                                     공통 댓글 : 프로시저, JOIN : Function
	private String title, poster, chef, link;
}

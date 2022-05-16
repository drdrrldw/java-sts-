package kr.human.memo.vo;

import java.util.Date;

import lombok.Data;

/*
 * 5. vo 패키지에 CommentVO를 만들자    --->  테이블과 1:1 대응 되도록 만든다.
 create table comment(
		idx int primary key auto_increment, 
		name varchar(40) not null,
		password varchar(40) not null,
		content varchar(200) not null,
		regDate timestamp default now(),
		ip varchar(20) not null
	)
	


 */

@Data
public class CommentVO {
	private int idx;
	private String name;
	private String password;
	private String content;
	private Date regDate;  //(util의 date)
	private String ip;	
	// 저장/수정/삭제 구분하기 위한 필드 (DB와 연관x)
	private String mode;
}

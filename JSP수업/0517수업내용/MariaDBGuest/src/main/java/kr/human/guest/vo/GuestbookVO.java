package kr.human.guest.vo;

import java.util.Date;

import lombok.Data;

/*
 
	create table guestbook(
	idx int primary key auto_increment,
	name varchar(40) not null,
	password varchar(40) not null,
	content text not null,			--- 여기만 변경
	regDate timestamp default now(),
	ip varchar(40) not null
	);
	
	
 */
@Data
public class GuestbookVO {
	private int idx;
	private String name;
	private String password;
	private String content;
	private Date regDate;
	private String ip;
	
	// 하나를 추가하자
	// 저장/수정/삭제를 구분하기 위한 필드
	
	private String mode;
	
}

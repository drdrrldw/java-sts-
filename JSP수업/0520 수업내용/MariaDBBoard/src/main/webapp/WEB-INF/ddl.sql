create table board(
	idx int primary key auto_increment,
	name varchar(30) not null,
	password varchar(50) not null,
	subject varchar(300) not null,
	content text not null,
	regDate timestamp default now(),
	clickCount int(4) default 0,
	ip varchar(20) not null
);



select password('1234'), md5('1234'), sha('1234');

select length (password('1'));


INSERT INTO board (name, password, subject, content, ip)
VALUES
	('한사람', password('1234'), '제목이다1', '내용이당1', '192.168.0.17'),
	('두사람', password('1234'), '제목이다2', '내용이당2', '192.168.0.17'),
	('세사람', password('1234'), '제목이다3', '내용이당3', '192.168.0.17'),
	('네사람', password('1234'), '제목이다4', '내용이당4', '192.168.0.17'),
	('오사람', password('1234'), '제목이다5', '내용이당5', '192.168.0.17');
	

delete from board where idx=3;



-- 댓글 테이블을 만들자
create table board_comment(
	idx int primary key auto_increment,
	ref int not null,
	name varchar(30) not null,
	password varchar(50) not null,
	content text not null,
	regDate timestamp default now(),
	ip varchar(20) not null,
	FOREIGN KEY(ref) REFERENCES board(idx)
);

desc board_comment;
select * from information_schema.table_constraints where table_name = 'board_comment';


-- 댓글을 몇개 추가해보자
select idx from board;

insert into board_comment (ref, name, password, content, ip) 
values (4, '멍멍이','1234','댓글을 달아보자\n하하하하','192.168.97.123'),
(4, '멍멍이2','1234','댓글을 달아보자\n하하하하2','192.168.97.123'),
(6, '멍멍이','1234','댓글을 달아보자\n하하하하555','192.168.97.123'),
(9, '멍멍이1','1234','댓글을 달아보자\n하하하하3','192.168.97.123'),
(9, '멍멍이2','1234','댓글을 달아보자\n하하하하4','192.168.97.123');

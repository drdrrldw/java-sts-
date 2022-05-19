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
	create table guestbook(
	idx int primary key auto_increment,
	name varchar(40) not null,
	password varchar(40) not null,
	content text not null,			
	regDate timestamp default now(),
	ip varchar(40) not null
	);
	

desc guestbook ;

select * from guestbook;




DELETE FROM guestbook;

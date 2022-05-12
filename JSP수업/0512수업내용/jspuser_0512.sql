-- 테이블 목록 확인하기
show tables;
-- 테이블 작성하기
/*
 *  create table 테이블 이름(
 * 		필드명 데이터타입 제한조건,
 * 		필드명 데이터타입 제한조건,
 * 		.		
 * 		.
 * 		.
 * 		필드명 데이터타입 제한조건,
 * 		필드명 데이터타입 제한조건
 *  );
 */
-- 테이블 삭제
drop table test;

create table test(
	idx int primary key auto_increment, -- 키필드로 사용하겠다, auto_increment(자동으로 증가해서 들어가게하는것)
	name varchar(20) not null, -- 이름은 가변길이 문자열로 20자 까지 저장, 필수입력
	age int(3) default 0, -- 나이는 정수 3자리, 기본값으로 0으로 넣겠다
	gender char(1) check(gender in ('M', 'F'))
);

-- 테이블 구조 확인하기
desc test;

-- 입력
/*
 * insert into 테이블명 (필드명,.....) values (데이터,.....);
 */

insert into test (name, gender) values ('한사람', 'M');
insert test values (0, '두사람', 33, 'F'); 
insert into test(name) values ('세사람');
-- insert into test(age) valuse (22); -- not null인 name이 없기 때문에 에러
insert into test(name, age, gender) values ('네사람', 12, 'F');	-- 위에 실패한건 들어가지 않았다.
insert into test(gender, name) values ('M', '오사람');  -- 필드명 순서는 중요하지가 않다.
insert into test(gender, name) values ('A', '오사람');
insert into test(name) values ('황금박쥐온세상을 놀라게하다');
-- insert into test(name) values ('황금박쥐온세상을 놀라게하다 아주아주 아아아아아 아 주 긴 이름');

-- 모든 데이터 조회
-- select 필드명... from 테이블명 where 조건
select * from test;		-- 필드명에 * 을 쓰면 모든 필드 이다.

select name, age from test;
-- 정렬
select * from test order by age;	-- 나이 오름차순
select * from test order by age desc;	-- 나이 내림차순
select * from test order by age desc, name;	-- 나이 내림차순 이름 오름차순

-- 개수 제한
-- select 필드명... from 테이블명 where 조건 limit 시작번호, 개수
-- 시작번호는 0부터 시작된다.
select * from test;
select * from test limit 0, 3;
select * from test limit 3, 2;


-- 조건 지정
select * from test where gender='M';
select * from test where gender!='M';
select * from test where gender<>'M';
select * from test where gender<>'M' and age >= 30;



-- DB CRUD명령
-- C : (create) : insert ==> 넣고
-- R : (read) : select ==> 읽고
-- U : (Update) : update ==> 고치고
-- D : (Delete) : delete ==> 지우고

-- 데이터 수정 : update에 조건을 주지 않으면 전체가 모두 변경 된다.
-- update 테이블명 set 필드명=값, ..... where 조건;
select * from test;
update test set age = 10, gender='F' where idx=3;
update test set age = age+1;



-- 데이터 삭제 : delete에 조건을 주지 않으면 전체가 모두 삭제 된다.
-- delete 테이블명 where 조건;

delete from test where age<=0;
select * from test;
select * from test;
delete from test where age<=10;
select * from test;

delete from test;
select * from test;

insert into test(name, gender) values('한사람', 'M');
select * from test;


drop table test;



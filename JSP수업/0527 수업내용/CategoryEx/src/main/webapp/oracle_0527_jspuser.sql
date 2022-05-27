-- 답변형 게시판의 로직을 처리해 보자
DROP TABLE
DROP SEQUENCE

CREATE SEQUENCE CATEGORY_IDX_SEQ;
CREATE TABLE CATEGORY (
	idx NUMBER PRIMARY KEY,
	REF NUMBER DEFAULT 0,	-- 원본 글의 번호저장
	seq NUMBER DEFAULT 0,   -- 나타날 순서
	lev NUMBER DEFAULT 0, 	-- 몇단계인지 나타낸다. 0이면 원본, 1이면 답변 , 2면 답변의 답변....
	item varchar(50) NOT NULL,   -- 항목
	del char(1) DEFAULT 'N' CHECK(del IN ('Y', 'N')) 	-- 삭제유무 저장, 값제한 Y / N 만 입력가능
);

-- 원본글 2개를 넣어보자.
INSERT INTO category (idx, REF, item)values(CATEGORY_IDX_SEQ.nextval, CATEGORY_IDX_SEQ.currval, '전자제품'); -- 원본글 쿼리가 된다.
INSERT INTO category (idx, REF, item)values(CATEGORY_IDX_SEQ.nextval, CATEGORY_IDX_SEQ.currval, '주류');


SELECT * FROM category;


-- 주류 밑으로 소주를 저장해보자
INSERT INTO category (idx, REF,seq,lev,item) values(CATEGORY_IDX_SEQ.nextval, 2, 1, 1,  '소주');


-- 전자제품 밑으로 냉장고를 저장해보자.
INSERT INTO category (idx, REF,seq,lev,item) values(CATEGORY_IDX_SEQ.nextval, 1, 1, 1,  '냉장고');  -- 답변 등록 쿼리
SELECT * FROM category;


SELECT * FROM CATEGORY c ORDER BY REF DESC , seq;	-- selectList 할 쿼리가 된다.

-- 주류 밑에 맥주를 추가해보자. ---> 글번호 5, ref 2 , seq 1, lev 1
-- 먼저 seq보다 큰값을 모두 1씩 증가
UPDATE CATEGORY SET seq =  seq + 1 WHERE REF=2 AND seq > 0 ;
INSERT INTO category (idx, REF,seq,lev,item) values(CATEGORY_IDX_SEQ.nextval, 2, 1, 1,  '맥주');

SELECT * FROM CATEGORY c ORDER BY REF DESC , seq;	-- selectList 할 쿼리가 된다.

-- 맥주밑으로 카스를 집어 넣어보자.

INSERT INTO category (idx, REF,seq,lev,item) values(CATEGORY_IDX_SEQ.nextval, 2, 2, 2,  '카스');

-- 맥주 밑으로 테라 집어 넣어보자.
UPDATE CATEGORY SET seq =  seq + 1 WHERE REF=2 AND seq > 1 ;
INSERT INTO category (idx, REF,seq,lev,item) values(CATEGORY_IDX_SEQ.nextval, 2, 2, 2,  '테라');

SELECT * FROM CATEGORY c ORDER BY REF DESC , seq;
-- Day3 2025.05.14
-- 1. MySQL SQL 기본

-- 1. CRUD (INSERT, SELECT, UPDATE, DELETE) 2. 서브쿼리

-- 1. ORDER BY 는 기본적으로 오름차순 (ASC 생략) 내림차순 사용시 DESC 추가
-- 2. 중복 제거시 SELECT 뒤에 DISTINCT 추가
-- 3. 출력 갯수 제한 시 LIMIT 출력숫자 추가 (LIMIT 시작, 갯수 로 사용가능)
-- 4. ORDER BY 로 정렬 , GROUP BY 로 집계함수(SUM,AVG,COUNT)를 사용하여 그룹화
-- 5. GROUP BY 뒤에 HAVING 문을 추가하여 조건 추가
-- 6. CREATE TABLE new테이블 (SELECT ... ) 로 기존 테이블을 새로운 테이블로 복사

USE sqldb;

-- SELECT문 연습
/* SELECT name,height FROM usertbl
WHERE height BETWEEN 180 AND 183 */

/* SELECT name, addr FROM usertbl
WHERE addr IN ('경남', '전남', '경북'); */

/* SELECT name AS 이름, height AS 몸무게 FROM usertbl
WHERE name LIKE '김%'; */

-- 서브쿼리 연습
/* SELECT name, height FROM usertbl
WHERE height > (SELECT height FROM usertbl WHERE name = '김경호') */

/* SELECT name, height FROM usertbl
WHERE height >= ANY (SELECT height FROM usertbl WHERE addr = '경남'); */

-- SELECT name, height FROM usertbl
-- WHERE height > ALL (SELECT height FROM usertbl WHERE addr = '경남') 







/**
 * 1. 문제정보
 *  - 제목 : 이름이 있는 동물의 아이디
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59407
 *  2. 풀이핵심
 *  - SELECT, FROM, WHERE, ORDER BY의 순서
 * 3. 풀이후기
 *  - SQL을 너무 오랜만에 해서 순서도 작성방법도 기억이 나질 않았다. 되살리는게 중요해보인다.
 */
SELECT A.ANIMAL_ID 
	FROM ANIMAL_INS A 
	WHERE A.NAME IS NOT NULL 
	ORDER BY A.ANIMAL_ID ASC;
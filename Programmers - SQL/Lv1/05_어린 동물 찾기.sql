/**
 * 1. 문제정보
 *  - 제목 : 어린 동물 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59037
 *  2. 풀이핵심
 *  - SELECT, FROM, WHERE, ORDER BY 의 순서
 * 3. 풀이후기
 *  - 조건 값이 일치 않는 경우를 찾는 것이다. 젊다라는 조건이 모호해서 조금 걸렸다.
 */
SELECT A.ANIMAL_ID, A.NAME
FROM ANIMAL_INS A
WHERE A.INTAKE_CONDITION != "Aged"
ORDER BY A.ANIMAL_ID;
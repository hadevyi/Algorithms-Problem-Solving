/**
 * 1. 문제정보
 *  - 제목 : 아픈 동물 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59036
 *  2. 풀이핵심
 *  - SELECT, FROM, WHER, ORDER BY 의 순서
 * 3. 풀이후기
 *  - 간단하게 진행하지만 아직도 순서가 헷갈린다.
 */
SELECT A.ANIMAL_ID, A.NAME
FROM ANIMAL_INS A
WHERE A.INTAKE_CONDITION = "Sick"
ORDER BY A.ANIMAL_ID;
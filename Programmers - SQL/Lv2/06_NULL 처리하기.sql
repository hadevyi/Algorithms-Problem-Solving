/**
 * 1. 문제정보
 *  - 제목 : NULL 처리하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59410
 *  2. 풀이핵심
 *  - CASE 문 사용하기
 * 3. 풀이후기
 *  - 오랜만에 썼다고 또 헷갈린다.
 */
SELECT A.ANIMAL_TYPE, 
    CASE 
        WHEN A.NAME IS NULL THEN "No name"
        ELSE A.NAME
    END AS NAME,
    A.SEX_UPON_INTAKE
FROM ANIMAL_INS A
ORDER BY A.ANIMAL_ID;
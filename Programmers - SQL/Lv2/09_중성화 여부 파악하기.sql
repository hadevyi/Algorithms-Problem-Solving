/**
 * 1. 문제정보
 *  - 제목 : 중성화 여부 파악하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59409
 *  2. 풀이핵심
 *  - CASE END 구절 활용하기
 * 3. 풀이후기
 *  - 작성에 큰 어려움은 없는 문제였다.
 */
SELECT A.ANIMAL_ID, A.NAME,
    CASE WHEN A.SEX_UPON_INTAKE LIKE "%Neutered%" THEN "O"
        WHEN A.SEX_UPON_INTAKE LIKE "%Spayed%" THEN "O"
        ELSE "X"
    END AS "중성화"
FROM ANIMAL_INS A
ORDER BY A.ANIMAL_ID;
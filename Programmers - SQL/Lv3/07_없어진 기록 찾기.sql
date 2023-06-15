/**
 * 1. 문제정보
 *  - 제목 : 없어진 기록 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59042
 *  2. 풀이핵심
 *  - 기준으로 JOIN에서 NULL인 값을 출력
 * 3. 풀이후기
 *  - LV 기준이 모호한것같다 2보다 쉬운 문제였다.
 */
SELECT O.ANIMAL_ID, O.NAME
FROM ANIMAL_OUTS O
LEFT JOIN ANIMAL_INS I
ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE I.DATETIME IS NULL
ORDER BY O.ANIMAL_ID;
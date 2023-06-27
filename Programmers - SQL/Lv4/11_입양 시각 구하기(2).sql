/**
 * 1. 문제정보
 *  - 제목 : 입양 시각 구하기(2)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59413
 *  2. 풀이핵심
 *  - WITH RECURSIVE를 배웠다.
 * 3. 풀이후기
 *  - 임의의 0~23의 가상 테이블을 만든다.
 */
SELECT R.HOUR, 
    CASE
        WHEN O.COUNT IS NULL THEN 0
        ELSE O.COUNT
    END AS COUNT
FROM (
    WITH RECURSIVE HOURS (HOUR) AS (
        SELECT 0 UNION 
        SELECT HOUR + 1 FROM HOURS WHERE HOUR < 23
    )
    SELECT HOUR FROM HOURS
) AS R
LEFT JOIN (
    SELECT HOUR(A.DATETIME) AS HOUR, COUNT(*) AS COUNT
    FROM ANIMAL_OUTS A
    GROUP BY HOUR
) AS O
ON O.HOUR = R.HOUR
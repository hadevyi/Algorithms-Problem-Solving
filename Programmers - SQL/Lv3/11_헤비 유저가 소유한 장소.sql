/**
 * 1. 문제정보
 *  - 제목 : 헤비 유저가 소유한 장소
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/77487
 *  2. 풀이핵심
 *  - IN 활용하기
 * 3. 풀이후기
 *  - 필요한 부분을 서브쿼리의 IN으로 활용해서 구현하였음
 */
SELECT *
FROM PLACES
WHERE HOST_ID IN (
    SELECT HOST_ID
    FROM PLACES
    GROUP BY HOST_ID
    HAVING COUNT(*) > 1
)
ORDER BY ID;
/**
 * 1. 문제정보
 *  - 제목 : 즐겨찾기가 가장 많은 식당 정보 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131123
 *  2. 풀이핵심
 *  - 서브쿼리를 사용해서 진행하기
 * 3. 풀이후기
 *  - IN으로 전달하는 결과를 이해하는 것에 익숙해져야할 것같다.
 */
SELECT R.FOOD_TYPE, R.REST_ID, R.REST_NAME, R.FAVORITES
FROM REST_INFO R
WHERE (R.FOOD_TYPE, R.FAVORITES)
    IN (
        SELECT F.FOOD_TYPE, MAX(F.FAVORITES)
        FROM REST_INFO F
        GROUP BY F.FOOD_TYPE
    )
ORDER BY R.FOOD_TYPE DESC;
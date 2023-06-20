/**
 * 1. 문제정보
 *  - 제목 : 식품분류별 가장 비싼 식품의 정보 조회하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131116
 *  2. 풀이핵심
 *  - 각 구간의 MAX를 구하기
 * 3. 풀이후기
 *  - 내가 가장 취약한 구간인 것같다... GROUP BY를 통한 IN을 사용하는 것이 중요하다!
 */
SELECT CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME
FROM FOOD_PRODUCT
WHERE (CATEGORY, PRICE) IN (
    SELECT CATEGORY, MAX(PRICE)
    FROM FOOD_PRODUCT
    WHERE CATEGORY IN ("과자", "국", "김치", "식용유")
    GROUP BY CATEGORY
)
ORDER BY PRICE DESC;
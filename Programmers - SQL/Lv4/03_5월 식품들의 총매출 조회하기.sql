/**
 * 1. 문제정보
 *  - 제목 : 5월 식품들의 총매출 조회하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131117
 *  2. 풀이핵심
 *  - JOIN 활용하기
 * 3. 풀이후기
 *  - 오히려 어렵게 생각해서 더 오래걸린 문제였다.
 */
SELECT O.PRODUCT_ID, P.PRODUCT_NAME, SUM(O.AMOUNT) * P.PRICE AS TOTAL_SALES
FROM FOOD_ORDER O
JOIN FOOD_PRODUCT P
ON O.PRODUCT_ID = P.PRODUCT_ID
WHERE O.PRODUCE_DATE BETWEEN "2022-05-01" AND "2022-05-31"
GROUP BY O.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, O.PRODUCT_ID;
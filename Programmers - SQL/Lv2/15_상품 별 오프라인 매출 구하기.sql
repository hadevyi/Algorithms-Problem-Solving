/**
 * 1. 문제정보
 *  - 제목 : 상품 별 오프라인 매출 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131533
 *  2. 풀이핵심
 *  - JOIN과 GROUP BY
 * 3. 풀이후기
 *  - 단계별로 푸는 것이 중요했다. 조금 까다로웠지만, 못 풀문제는 아니였다.
 */
SELECT P.PRODUCT_CODE, SUM(O.SALES_AMOUNT) * P.PRICE AS "SALES"
FROM OFFLINE_SALE O
JOIN PRODUCT P
ON O.PRODUCT_ID = P.PRODUCT_ID
GROUP BY P.PRODUCT_ID
ORDER BY SUM(O.SALES_AMOUNT) * P.PRICE DESC, P.PRODUCT_CODE ;
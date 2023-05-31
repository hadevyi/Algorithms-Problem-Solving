/**
 * 1. 문제정보
 *  - 제목 : 카테고리 별 상품 개수 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131529
 *  2. 풀이핵심
 *  - SUBSTR 사용
 * 3. 풀이후기
 *  - 처음사용해본 함수였다. 중요한건 시작이 0이 아닌 1이라는 것에 유의
 */
SELECT SUBSTR(P.PRODUCT_CODE, 1, 2) AS "CATEGORY", COUNT(P.PRODUCT_CODE) AS "PRODUCTS"
FROM PRODUCT P
GROUP BY SUBSTR(P.PRODUCT_CODE, 1, 2)
ORDER BY P.PRODUCT_CODE;
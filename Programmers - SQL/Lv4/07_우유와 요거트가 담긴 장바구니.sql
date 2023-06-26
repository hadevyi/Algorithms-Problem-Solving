/**
 * 1. 문제정보
 *  - 제목 : 우유와 요거트가 담긴 장바구니
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/62284
 *  2. 풀이핵심
 *  - 한 테이블을 활용해 특정 내용 확인
 * 3. 풀이후기
 *  - 처음에 생소하고 어려웠지만, 별도로 접근하니 괜찮았다.
 */
SELECT MILK.CART_ID
FROM (
    SELECT CART_ID
    FROM CART_PRODUCTS
    WHERE NAME = "Milk"
    GROUP BY CART_ID
) AS MILK
JOIN (
    SELECT CART_ID
    FROM CART_PRODUCTS
    WHERE NAME = "Yogurt"
    GROUP BY CART_ID
) AS YOGURT
ON MILK.CART_ID = YOGURT.CART_ID
ORDER BY MILK.CART_ID;
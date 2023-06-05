/**
 * 1. 문제정보
 *  - 제목 : 재구매가 일어난 상품과 회원 리스트 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131536
 *  2. 풀이핵심
 *  - GROUP BY, HAVING 활용
 * 3. 풀이후기
 *  - 재구매한 정보만 출력하기 위해서 HAVING 문을 활용했다.
 */
SELECT O.USER_ID, O.PRODUCT_ID
FROM ONLINE_SALE O
GROUP BY O.USER_ID, O.PRODUCT_ID
HAVING COUNT(O.PRODUCT_ID) >= 2
ORDER BY O.USER_ID, O.PRODUCT_ID DESC;
/**
 * 1. 문제정보
 *  - 제목 : 가격이 제일 비싼 식품의 정보 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131115
 *  2. 풀이핵심
 *  - 서브쿼리 사용해보기
 * 3. 풀이후기
 *  - 처음으로 사용해본 서브쿼리 차차 더 익숙해질 수 있도록 해야겠다.
 */
SELECT *
FROM FOOD_PRODUCT F
WHERE F.PRICE = (
    SELECT MAX(P.PRICE)
    FROM FOOD_PRODUCT P
);
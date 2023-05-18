/**
 * 1. 문제정보
 *  - 제목 : 가장 비싼 상품 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131697
 *  2. 풀이핵심
 *  - max 다뤄보기
 * 3. 풀이후기
 *  - 짧은 구문으로 해결할 수 있는 부분이다.
 */
SELECT MAX(P.PRICE)
FROM PRODUCT P;
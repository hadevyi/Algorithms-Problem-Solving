/**
 * 1. 문제정보
 *  - 제목 : 년, 월, 성별 별 상품 구매 회원 수 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131532
 *  2. 풀이핵심
 *  - DISTINCT 사용하기
 * 3. 풀이후기
 *  - 다른 내용은 쉽게 구현했으나 중복이 있을 수 있다는 생각을 간과하였다.
 */
SELECT YEAR(S.SALES_DATE) AS YEAR, MONTH(S.SALES_DATE) AS MONTH, I.GENDER, COUNT(DISTINCT(S.USER_ID)) AS USERS
FROM ONLINE_SALE S
LEFT JOIN USER_INFO I
ON S.USER_ID = I.USER_ID
WHERE I.GENDER IS NOT NULL
GROUP BY YEAR, MONTH, I.GENDER
ORDER BY YEAR, MONTH, I.GENDER;
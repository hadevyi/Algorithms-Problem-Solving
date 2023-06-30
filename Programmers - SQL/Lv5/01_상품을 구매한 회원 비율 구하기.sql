/**
 * 1. 문제정보
 *  - 제목 : 상품을 구매한 회원 비율 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131534
 *  2. 풀이핵심
 *  - GROUP BY, DISTINCT
 * 3. 풀이후기
 *  - 오히려 Lv4보다 쉬웠다. 괜찮은 문제
 */
SELECT YEAR(S.SALES_DATE) AS YEAR, MONTH(S.SALES_DATE) AS MONTH,
    COUNT(DISTINCT(S.USER_ID)) AS PUCHASED_USERS,
    ROUND(COUNT(DISTINCT(S.USER_ID)) / ( SELECT COUNT(*) FROM USER_INFO WHERE YEAR(JOINED) = 2021), 1) AS PUCHASED_RATIO
    ## YEAR, MONTH, 구매한 회원 수, 회원 비율(이 달에 구매한 인원/ 2021년 가입 총 인원)
FROM ONLINE_SALE S
JOIN USER_INFO I
ON S.USER_ID = I.USER_ID
WHERE YEAR(I.JOINED) = 2021
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH
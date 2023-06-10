/**
 * 1. 문제정보
 *  - 제목 : 카테고리 별 도서 판매량 집계하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/144855
 *  2. 풀이핵심
 *  - 
 * 3. 풀이후기
 *  - 
 */
SELECT B.CATEGORY, SUM(S.SALES) AS TOTAL_SALES
FROM BOOK_SALES S
LEFT JOIN BOOK B
ON S.BOOK_ID = B.BOOK_ID
WHERE YEAR(S.SALES_DATE) = 2022 AND MONTH(S.SALES_DATE) = 1
GROUP BY B.CATEGORY
ORDER BY B.CATEGORY;
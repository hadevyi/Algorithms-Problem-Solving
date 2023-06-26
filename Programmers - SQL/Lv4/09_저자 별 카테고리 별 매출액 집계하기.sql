/**
 * 1. 문제정보
 *  - 제목 : 저자 별 카테고리 별 매출액 집계하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/144856
 *  2. 풀이핵심
 *  - SUM의 범위
 * 3. 풀이후기
 *  - SUM(S.SALES) * B.PRICE과 SUM(S.SALES * B.PICE)의 차이였다. 어려웠지만, 그 차이점을 잘 확인할 수 있었다.
 *  - 참고 설명 https://school.programmers.co.kr/questions/47997
 */
SELECT A.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY, SUM(S.SALES * B.PRICE) AS TOTAL_SALES
FROM BOOK B, AUTHOR A, BOOK_SALES S
WHERE B.BOOK_ID = S.BOOK_ID AND A.AUTHOR_ID = B.AUTHOR_ID 
    AND S.SALES_DATE BETWEEN "2022-01-01" AND "2022-01-31"
GROUP BY A.AUTHOR_ID, B.CATEGORY
ORDER BY A.AUTHOR_ID, B.CATEGORY DESC;
/**
 * 1. 문제정보
 *  - 제목 : 조건에 맞는 도서와 저자 리스트 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/144854
 *  2. 풀이핵심
 *  - 간단한 JOIN 문제
 * 3. 풀이후기
 *  - DATE FORMAT을 오랜만에 활용하였다.
 */
SELECT B.BOOK_ID, A.AUTHOR_NAME, DATE_FORMAT(B.PUBLISHED_DATE, "%Y-%m-%d") AS "PUBLISHED_DATE"
FROM AUTHOR A
JOIN BOOK B
ON A.AUTHOR_ID = B.AUTHOR_ID
WHERE B.CATEGORY = "경제"
ORDER BY B.PUBLISHED_DATE;
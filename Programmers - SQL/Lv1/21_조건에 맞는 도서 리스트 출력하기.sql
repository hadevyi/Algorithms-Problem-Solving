/**
 * 1. 문제정보
 *  - 제목 : 조건에 맞는 도서 리스트 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/144853
 *  2. 풀이핵심
 *  - YEAR 찾기, 원하는 FORMAT으로 출력하기
 * 3. 풀이후기
 *  - 이젠 참고하지 않고, DATE_FORMAT을 자연스레 사용할 수 있게 되었다.
 */
SELECT B.BOOK_ID, DATE_FORMAT(B.PUBLISHED_DATE, "%Y-%m-%d") AS PUBLISHED_DATE
FROM BOOK B
WHERE YEAR(B.PUBLISHED_DATE) = 2021 AND B.CATEGORY = "인문"
ORDER BY B.PUBLISHED_DATE;
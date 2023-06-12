/**
 * 1. 문제정보
 *  - 제목 : 조건에 맞는 사용자와 총 거래금액 조회하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/164668
 *  2. 풀이핵심
 *  - GROUP BY, HAVING을 함께 쓰기
 * 3. 풀이후기
 *  - WHERE를 같이 사용하기 순서가 헷갈렸다. 그래도 단계대로 진행하여 어렵진 않았다.
 */
SELECT U.USER_ID, U.NICKNAME, SUM(B.PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD B
LEFT JOIN USED_GOODS_USER U
ON B.WRITER_ID = U.USER_ID
WHERE B.STATUS = "DONE" 
GROUP BY B.WRITER_ID
HAVING TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES;
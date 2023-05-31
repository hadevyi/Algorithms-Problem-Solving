/**
 * 1. 문제정보
 *  - 제목 : 진료과별 총 예약 횟수 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/132202
 *  2. 풀이핵심
 *  - GROUP BY, AS
 * 3. 풀이후기
 *  - 다른 문제들에 비하면 생소한 개념은 없었다.
 */
SELECT A.MCDP_CD AS "진료과코드", COUNT(A.MCDP_CD) AS "5월예약건수"
FROM APPOINTMENT A
WHERE YEAR(A.APNT_YMD) = 2022 AND MONTH(A.APNT_YMD) = 5
GROUP BY A.MCDP_CD
ORDER BY COUNT(A.MCDP_CD), A.MCDP_CD;
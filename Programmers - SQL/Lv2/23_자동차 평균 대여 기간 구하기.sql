/**
 * 1. 문제정보
 *  - 제목 : 자동차 평균 대여 기간 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/157342
 *  2. 풀이핵심
 *  - 평균을 구하는 방식에서 중요했다. DATEDIFF가 중요하다.
 * 3. 풀이후기
 *  - DATEDIFF가 무엇이 다른진 모르겠지만, 조정이 필요해보인다.
 */
SELECT C.CAR_ID, ROUND(SUM(DATEDIFF(C.END_DATE, C.START_DATE) + 1) / COUNT(DATEDIFF(C.END_DATE, C.START_DATE)), 1) AS AVERAGE_DURATION
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY C
GROUP BY C.CAR_ID
HAVING AVERAGE_DURATION >= 7
ORDER BY AVERAGE_DURATION DESC, C.CAR_ID DESC;
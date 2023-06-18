/**
 * 1. 문제정보
 *  - 제목 : 대여 횟수가 많은 자동차들의 월별 대여 횟수 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/151139
 *  2. 풀이핵심
 *  - WHERE IN과 GROUP BY를 다같이 사용하기
 * 3. 풀이후기
 *  - 서브쿼리를 별도로 짜는 부분에 어려움이 조금 있었다. 중복값이 많아서 신경쓰이는데 어떻게 해결할 수 있을지 고민해야겠다.
 */
SELECT MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE (START_DATE BETWEEN "2022-08-01" AND "2022-10-31") AND (CAR_ID IN (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE START_DATE BETWEEN "2022-08-01" AND "2022-10-31"
    GROUP BY CAR_ID
    HAVING COUNT(*) >= 5
))
GROUP BY CAR_ID, MONTH(START_DATE)
ORDER BY MONTH(START_DATE), CAR_ID DESC;
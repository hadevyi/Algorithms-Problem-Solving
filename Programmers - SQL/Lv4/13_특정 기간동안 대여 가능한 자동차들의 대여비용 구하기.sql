/**
 * 1. 문제정보
 *  - 제목 : 특정 기간동안 대여 가능한 자동차들의 대여비용 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/157339
 *  2. 풀이핵심
 *  - JOIN, WHRER, BAVING의 순서와 배치
 * 3. 풀이후기
 *  - 생각보다 오래 걸렸고, 난도도 높았다... 다시 풀어보면 좋을 것같다.
 */
SELECT C.CAR_ID, C.CAR_TYPE, ROUND(C.DAILY_FEE - (C.DAILY_FEE * P.DISCOUNT_RATE * 0.01), 0) * 30 AS FEE
FROM CAR_RENTAL_COMPANY_CAR C
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P
ON C.CAR_TYPE = P.CAR_TYPE AND P.DURATION_TYPE = "30일 이상"
WHERE C.CAR_ID NOT IN (
        SELECT CAR_ID
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE START_DATE <= "2022-11-30" AND END_DATE >= "2022-11-01"
    ) AND C.CAR_TYPE IN ("세단", "SUV")
HAVING 500000 <= FEE AND FEE < 2000000
ORDER BY FEE DESC, C.CAR_TYPE, C.CAR_ID DESC;
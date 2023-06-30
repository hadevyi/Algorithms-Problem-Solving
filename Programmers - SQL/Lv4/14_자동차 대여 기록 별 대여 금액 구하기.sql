/**
 * 1. 문제정보
 *  - 제목 : 자동차 대여 기록 별 대여 금액 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/151141
 *  2. 풀이핵심
 *  - CASE END와 JOIN으로 구성하기
 * 3. 풀이후기
 *  - 직전 문제와 유사한데 조금 더 구체적인 내용이였다.
 */
SELECT HISTORY_ID, 
    CASE
        WHEN P.DISCOUNT_RATE IS NULL THEN CH.DAILY_FEE * CH.DATE
        ELSE ROUND((CH.DAILY_FEE - (CH.DAILY_FEE * P.DISCOUNT_RATE * 0.01)) * CH.DATE, 0)
    END AS FEE
FROM (
    SELECT HISTORY_ID, CAR_TYPE, DAILY_FEE, DATEDIFF(END_DATE, START_DATE) + 1 AS DATE
    FROM CAR_RENTAL_COMPANY_CAR C, CAR_RENTAL_COMPANY_RENTAL_HISTORY H
    WHERE C.CAR_ID = H.CAR_ID AND C.CAR_TYPE = "트럭"
) AS CH # CAR HISTORY
LEFT JOIN (
    SELECT CAR_TYPE, DURATION_TYPE, DISCOUNT_RATE
    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
    WHERE CAR_TYPE = "트럭"
) AS P
ON CH.CAR_TYPE = P.CAR_TYPE AND P.DURATION_TYPE IN (
        CASE
            WHEN CH.DATE >= 90 THEN "90일 이상"
            WHEN CH.DATE >= 30 THEN "30일 이상"
            WHEN CH.DATE >= 7 THEN "7일 이상"
        END
    )
ORDER BY FEE DESC, CH.HISTORY_ID DESC;
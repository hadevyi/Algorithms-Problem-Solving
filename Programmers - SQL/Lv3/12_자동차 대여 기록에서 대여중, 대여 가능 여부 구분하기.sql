/**
 * 1. 문제정보
 *  - 제목 : 자동차 대여 기록에서 대여중 / 대여 가능 여부 구분하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/157340
 *  2. 풀이핵심
 *  - SUM IF를 활용함
 * 3. 풀이후기
 *  - 사용하기 어려운 부분이였다. MAX를 활용해서 하는 것도 있어서 같이 비교하면서 익히면 좋을 것같다.
 */
SELECT CAR_ID,
    CASE
        WHEN SUM(IF("2022-10-16" BETWEEN START_DATE AND END_DATE, 1, 0)) = 0 THEN "대여 가능"
        ELSE "대여중"
    END AS "AVAILABILITY"
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC;

SELECT 
    CAR_ID,
    MAX(CASE WHEN '2022-10-16' BETWEEN START_DATE AND END_DATE THEN '대여중'
    ELSE '대여 가능' END) AVAILABILTY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC
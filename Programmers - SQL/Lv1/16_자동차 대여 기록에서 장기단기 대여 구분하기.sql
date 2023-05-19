/**
 * 1. 문제정보
 *  - 제목 : 자동차 대여 기록에서 장기/단기 대여 구분하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/151138
 *  2. 풀이핵심
 *  - DATEDIFF 함수의 사용 방법과 CASE WHEN ELSE END의 사용 방법
 * 3. 풀이후기
 *  - DATEDIFF는 정상적으로 진행했지만, 문제 본문에 따라 추가 조정할 값이 필요했다.
 */
 SELECT C.HISTORY_ID, C.CAR_ID, 
    DATE_FORMAT(C.START_DATE, "%Y-%m-%d") AS START_DATE, 
    DATE_FORMAT(C.END_DATE, "%Y-%m-%d") AS END_DATE, 
    CASE WHEN DATEDIFF(C.END_DATE, C.START_DATE) + 1 >= 30 THEN "장기 대여"
        ELSE "단기 대여"
    END AS RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY C
WHERE YEAR(C.START_DATE) = 2022 AND MONTH(C.START_DATE) = 9
ORDER BY C.HISTORY_ID DESC;
/**
 * 1. 문제정보
 *  - 제목 : 평균 일일 대여 요금 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/151136
 *  2. 풀이핵심
 *  - 반올림을 하는 ROUND 활용하기
 * 3. 풀이후기
 *  - 나머지는 큰 어려움없이 진행했다. ROUND를 처음 사용해 참조했다.
 */
SELECT ROUND(AVG(C.DAILY_FEE), 0)
FROM CAR_RENTAL_COMPANY_CAR C
WHERE C.CAR_TYPE = "SUV";
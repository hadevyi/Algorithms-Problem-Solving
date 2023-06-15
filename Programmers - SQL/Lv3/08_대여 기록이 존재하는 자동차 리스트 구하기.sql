/**
 * 1. 문제정보
 *  - 제목 : 대여 기록이 존재하는 자동차 리스트 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/157341
 *  2. 풀이핵심
 *  - 단계대로 확인하며 정렬하기
 * 3. 풀이후기
 *  - 기준이 중요해서 LEFT JOIN을 집중적으로 진행하였음
 */
SELECT C.CAR_ID
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H
LEFT JOIN CAR_RENTAL_COMPANY_CAR C
ON H.CAR_ID = C.CAR_ID
WHERE MONTH(H.START_DATE) = 10 AND C.CAR_TYPE = "세단"
GROUP BY C.CAR_ID
ORDER BY C.CAR_ID DESC;
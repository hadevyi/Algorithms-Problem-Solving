/**
 * 1. 문제정보
 *  - 제목 : 특정 옵션이 포함된 자동차 리스트 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/157343
 *  2. 풀이핵심
 *  - 옵션에 네비게이션이 포함되어있는지 확인
 * 3. 풀이후기
 *  - 이전 문제에 비하면 간단한 문제
 */
SELECT *
FROM CAR_RENTAL_COMPANY_CAR C
WHERE C.OPTIONS LIKE "%네비게이션%"
ORDER BY C.CAR_ID DESC;
/**
 * 1. 문제정보
 *  - 제목 : 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/151137
 *  2. 풀이핵심
 *  - Group by 활용
 * 3. 풀이후기
 *  - 어려운 부분은 아니였지만, having과 where 중 무엇으로 써야할지 모호했다.
 */
SELECT C.CAR_TYPE, COUNT(C.CAR_ID) AS CARS
FROM CAR_RENTAL_COMPANY_CAR C
WHERE C.OPTIONS LIKE "%통풍시트%" OR C.OPTIONS LIKE "%열선시트%" OR C.OPTIONS LIKE "%가죽시트%"
GROUP BY C.CAR_TYPE
ORDER BY C.CAR_TYPE;
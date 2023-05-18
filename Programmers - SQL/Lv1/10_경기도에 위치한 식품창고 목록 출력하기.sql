/**
 * 1. 문제정보
 *  - 제목 : 경기도에 위치한 식품창고 목록 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131114
 *  2. 풀이핵심
 *  - IFNULL을 사용해 치환하는 것이 중요하다.
 * 3. 풀이후기
 *  - 다른 문자열이였다면 replace로 올테지만, 찾아야하는 것이 null이라 별도가 필요했다.
 */
SELECT F.WAREHOUSE_ID, F.WAREHOUSE_NAME, F.ADDRESS, IFNULL(F.FREEZER_YN, "N") AS FREEZER
FROM FOOD_WAREHOUSE F
WHERE F.ADDRESS LIKE "경기도%"
ORDER BY F.WAREHOUSE_ID;
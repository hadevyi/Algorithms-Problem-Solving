/**
 * 1. 문제정보
 *  - 제목 : 강원도에 위치한 생산공장 목록 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131112
 *  2. 풀이핵심
 *  - LIKE 사용해보기
 * 3. 풀이후기
 *  - LIKE를 사용하고, %를 사용하면 구성을 할 수 있다.
 */
SELECT F.FACTORY_ID, F.FACTORY_NAME, F.ADDRESS
FROM FOOD_FACTORY F
WHERE F.ADDRESS LIKE "강원도%"
ORDER BY F.FACTORY_ID;
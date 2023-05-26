/**
 * 1. 문제정보
 *  - 제목 : 중복 제거하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59408
 *  2. 풀이핵심
 *  - DISTINCT 익숙해지기
 * 3. 풀이후기
 *  - 써야하는 이유는 기억나는데, 참고하지않고 스펠링을 쓸 수가 없다..
 */
SELECT COUNT(DISTINCT(A.NAME))
FROM ANIMAL_INS A
WHERE A.NAME IS NOT NULL;
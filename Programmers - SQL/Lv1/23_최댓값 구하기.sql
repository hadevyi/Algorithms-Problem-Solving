/**
 * 1. 문제정보
 *  - 제목 : 최댓값 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59415
 *  2. 풀이핵심
 *  - ORDER BY와 LIMIT로 해결된 문제
 * 3. 풀이후기
 *  - 간단하면서도 "최근"이라는 기준에서 헷갈렸음
 */
SELECT A.DATETIME
FROM ANIMAL_INS A
ORDER BY A.DATETIME DESC
LIMIT 1;
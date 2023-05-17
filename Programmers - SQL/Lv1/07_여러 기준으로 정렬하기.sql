/**
 * 1. 문제정보
 *  - 제목 : 여러 기준으로 정렬하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59404
 *  2. 풀이핵심
 *  - 여러개의 order by 기준 생각하기
 * 3. 풀이후기
 *  - order by는 여러개를 쓸 수 있고, 그 순서에 따라 결과물이 달라진다.
 */
SELECT A.ANIMAL_ID, A.NAME, A.DATETIME
FROM ANIMAL_INS A
ORDER BY A.NAME ASC, A.DATETIME DESC;
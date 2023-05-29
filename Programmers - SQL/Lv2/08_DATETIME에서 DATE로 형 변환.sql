/**
 * 1. 문제정보
 *  - 제목 : DATETIME에서 DATE로 형 변환
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59414
 *  2. 풀이핵심
 *  - DATE_FROMAT 활용
 * 3. 풀이후기
 *  - 원하는 결과를 얻기 위한 정제
 */
SELECT A.ANIMAL_ID, A.NAME, DATE_FORMAT(A.DATETIME, "%Y-%m-%d") AS "날짜"
FROM ANIMAL_INS A
ORDER BY A.ANIMAL_ID;
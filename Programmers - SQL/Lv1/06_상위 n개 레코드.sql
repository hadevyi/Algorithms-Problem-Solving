/**
 * 1. 문제정보
 *  - 제목 : 상위 n개 레코드
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59405
 *  2. 풀이핵심
 *  - LIMIT의 사용 방법
 * 3. 풀이후기
 *  - 출력의 갯수를 제한하는 방법을 사용하였다.
 */
SELECT A.NAME
FROM ANIMAL_INS A
ORDER BY A.DATETIME
LIMIT 1;
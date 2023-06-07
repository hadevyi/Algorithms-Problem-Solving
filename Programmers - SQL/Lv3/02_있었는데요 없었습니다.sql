/**
 * 1. 문제정보
 *  - 제목 : 있었는데요 없었습니다
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59043
 *  2. 풀이핵심
 *  - JOIN 활용하기
 * 3. 풀이후기
 *  - 앞선 문제보다는 더 간단한 JOIN 문제였다.
 */
SELECT I.ANIMAL_ID, I.NAME
FROM ANIMAL_INS I
JOIN ANIMAL_OUTS O
ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE I.DATETIME > O.DATETIME
ORDER BY I.DATETIME;
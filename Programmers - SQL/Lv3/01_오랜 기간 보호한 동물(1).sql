/**
 * 1. 문제정보
 *  - 제목 : 오랜 기간 보호한 동물(1)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59044
 *  2. 풀이핵심
 *  - LEFT JOIN 활용하기
 * 3. 풀이후기
 *  - 지금까지 공통만 찾아서 진행한 JOIN을 했다면, 특정 테이블 기준으로 JOIN하는 LEFT JOIN을 활용해보았다.
 */
SELECT I.NAME, I.DATETIME
FROM ANIMAL_INS I
LEFT JOIN ANIMAL_OUTS O
ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE O.ANIMAL_ID IS NULL
ORDER BY I.DATETIME
LIMIT 3;
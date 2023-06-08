/**
 * 1. 문제정보
 *  - 제목 : 오랜 기간 보호한 동물(2)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59411
 *  2. 풀이핵심
 *  - LEFT JOIN 복습
 * 3. 풀이후기
 *  - 이전에 푼 문제가 있어서 그런지 훨씬 괜찮았다.
 */
SELECT I.ANIMAL_ID, I.NAME
FROM ANIMAL_INS I
LEFT JOIN ANIMAL_OUTS O
ON I.ANIMAL_ID = O.ANIMAL_ID
ORDER BY DATEDIFF(O.DATETIME, I.DATETIME) DESC
LIMIT 2;
/**
 * 1. 문제정보
 *  - 제목 : 입양 시각 구하기(1)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59412
 *  2. 풀이핵심
 *  - GROUP BY와 DATE FORMATE을 같이 쓰는 과정
 * 3. 풀이후기
 *  - 다양한 내용이 복잡적으로 나오기 시작했다. 이쯤에서 개념정리를 한 번 하고 가면 더 좋을 것같다.
 */
SELECT DATE_FORMAT(A.DATETIME, "%H") AS "HOUR",
        COUNT(DATE_FORMAT(A.DATETIME, "%h")) AS "COUNT"
FROM ANIMAL_OUTS A
WHERE DATE_FORMAT(A.DATETIME, "%H") >= 9 AND DATE_FORMAT(A.DATETIME, "%H") <= 19
GROUP BY DATE_FORMAT(A.DATETIME, "%H")
ORDER BY DATE_FORMAT(A.DATETIME, "%H");
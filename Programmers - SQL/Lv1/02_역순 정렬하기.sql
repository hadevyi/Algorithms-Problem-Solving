/**
 * 1. 문제정보
 *  - 제목 : 역순 정렬하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59035
 *  2. 풀이핵심
 *  - 역순 정렬하기
 * 3. 풀이후기
 *  - 오름차순 asc, 내림차순 desc
 */
SELECT A.NAME, A.DATETIME
    FROM ANIMAL_INS A
    ORDER BY A.ANIMAL_ID DESC;
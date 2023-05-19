/**
 * 1. 문제정보
 *  - 제목 : 이름이 없는 동물의 아이디
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59039
 *  2. 풀이핵심
 *  - is null 확인하기
 * 3. 풀이후기
 *  - 간단한 진행
 */
SELECT A.ANIMAL_ID
FROM ANIMAL_INS A
WHERE A.NAME IS NULL
ORDER BY A.ANIMAL_ID;
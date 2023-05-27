/**
 * 1. 문제정보
 *  - 제목 : 이름에 el이 들어가는 동물 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59047
 *  2. 풀이핵심
 *  - LIKE를 활용하기
 * 3. 풀이후기
 *  - table 내의 개 뿐만 아닌 다양한 정보가 있음이 중요하다.
 */
SELECT A.ANIMAL_ID, A.NAME
FROM ANIMAL_INS A
WHERE A.NAME LIKE "%EL%" AND A.ANIMAL_TYPE = "Dog"
ORDER BY A.NAME;
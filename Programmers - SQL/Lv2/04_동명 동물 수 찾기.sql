/**
 * 1. 문제정보
 *  - 제목 : 동명 동물 수 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59041
 *  2. 풀이핵심
 *  - GROUP BY, HAVING을 같이 봐야함
 * 3. 풀이후기
 *  - GROUP BY를 자주해본적이 없어 또 어색한 문법은 만났다.
 */
SELECT A.NAME, COUNT(A.NAME) AS COUNT
FROM ANIMAL_INS A
WHERE A.NAME IS NOT NULL
GROUP BY A.NAME
HAVING COUNT >= 2
ORDER BY A.NAME;
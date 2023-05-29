/**
 * 1. 문제정보
 *  - 제목 : 고양이와 개는 몇 마리 있을까
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59040
 *  2. 풀이핵심
 *  - GROUP BY
 * 3. 풀이후기
 *  - 문제를 읽었을 때 어떻게 해결할지 어려웠다. 그래도 GROUP BY로 접근했을 때 큰 힌트가 되었던 것보면 잊진 않았지만 어색한것같다.
 */
SELECT A.ANIMAL_TYPE, COUNT(A.ANIMAL_TYPE)
FROM ANIMAL_INS A
GROUP BY A.ANIMAL_TYPE
ORDER BY A.ANIMAL_TYPE;
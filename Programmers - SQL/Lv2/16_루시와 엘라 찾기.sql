/**
 * 1. 문제정보
 *  - 제목 : 루시와 엘라 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59046
 *  2. 풀이핵심
 *  - IN을 활용하기
 * 3. 풀이후기
 *  - 조건을 간단하게 표현할 수 있어서 더 좋았다. 이 방법이 아니라 OR을 사용하기도 했지만, 그거보다는 더 간단했다.
 */
SELECT A.ANIMAL_ID, A.NAME, A.SEX_UPON_INTAKE
FROM ANIMAL_INS A
WHERE A.NAME IN ("Lucy", "Ella", "Pickle", "Rogan", "Sabrina","Mitty")
ORDER BY A.ANIMAL_ID;
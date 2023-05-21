/**
 * 1. 문제정보
 *  - 제목 : 최솟값 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59038
 *  2. 풀이핵심
 *  - LIMIT랑 MIN 중에 무엇이 더 적절한지 확인했음
 * 3. 풀이후기
 *  - 대소구별이 명확한 컬럼일때는 MIN이 훨씬 좋은 것을 확인할 수 있었음
 */
SELECT A.DATETIME
FROM ANIMAL_INS A
ORDER BY A.DATETIME
LIMIT 1;

SELECT MIN(A.DATETIME)
FROM ANIMAL_INS A
ORDER BY A.DATETIME;
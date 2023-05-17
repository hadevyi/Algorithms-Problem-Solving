/**
 * 1. 문제정보
 *  - 제목 : 나이 정보가 없는 회원 수 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131528
 *  2. 풀이핵심
 *  - IS NULL, COUNT 사용해보기
 * 3. 풀이후기
 *  - 둘 다 처음 사용해보는 거지만, 다른 함수들과 유사해서 무난했다.
 */
SELECT COUNT(USER_ID)
FROM USER_INFO U
WHERE U.AGE IS NULL;
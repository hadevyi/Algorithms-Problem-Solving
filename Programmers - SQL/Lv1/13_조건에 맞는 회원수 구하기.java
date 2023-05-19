/**
 * 1. 문제정보
 *  - 제목 : 조건에 맞는 회원수 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131535
 *  2. 풀이핵심
 *  - 여러가지의 조건 사용, BETWEEN AND 사용하기
 * 3. 풀이후기
 *  - 단순한 조건문의 조합으로도 가능하지만, BETWEEN AND는 다양한 데이터를 처리할 수 있어서 이쪽으로 익숙해져야겠다
 */
SELECT COUNT(U.USER_ID)
FROM USER_INFO U
WHERE YEAR(U.JOINED) = "2021" AND U.AGE BETWEEN 20 AND 29;
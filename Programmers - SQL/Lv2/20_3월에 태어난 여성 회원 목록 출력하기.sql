/**
 * 1. 문제정보
 *  - 제목 : 3월에 태어난 여성 회원 목록 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131120
 *  2. 풀이핵심
 *  - DATE FORMAT, NOT NULL 활용
 * 3. 풀이후기
 *  - 조건들을 모두 적는 연습을 해야겠다. 다 완료하고 조건 추가를 안해서 오래 풀었다.
 */
SELECT M.MEMBER_ID, M.MEMBER_NAME, M.GENDER, DATE_FORMAT(M.DATE_OF_BIRTH, "%Y-%m-%d") AS DATE_OF_BIRTH
FROM MEMBER_PROFILE M
WHERE M.TLNO IS NOT NULL AND MONTH(M.DATE_OF_BIRTH) = 3 AND M.GENDER = "W"
ORDER BY M.MEMBER_ID;
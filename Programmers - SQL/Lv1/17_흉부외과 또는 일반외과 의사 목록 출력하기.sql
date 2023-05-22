/**
 * 1. 문제정보
 *  - 제목 : 흉부외과 또는 일반외과 의사 목록 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/132203
 *  2. 풀이핵심
 *  - 결과 정돈 및 정렬 순서
 * 3. 풀이후기
 *  - 이제 이쯤은 거뜬하다!
 */
SELECT D.DR_NAME, D.DR_ID, D.MCDP_CD, DATE_FORMAT(D.HIRE_YMD, "%Y-%m-%d") AS HIRE_YMD
FROM DOCTOR D
WHERE D.MCDP_CD = "CS" OR D.MCDP_CD = "GS"
ORDER BY D.HIRE_YMD DESC, D.DR_NAME ASC;
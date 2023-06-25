/**
 * 1. 문제정보
 *  - 제목 : 취소되지 않은 진료 예약 조회하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/132204
 *  2. 풀이핵심
 *  - 여러 단계로 진행한 join
 * 3. 풀이후기
 *  - 3번 join이 처음이였다. 어려웠지만, 그래도 단계대로 하니 가능하다. 그래도 더 간단한 풀이를 봐야할듯..
 */
SELECT SUB.APNT_NO, SUB.PT_NAME, SUB.PT_NO, D.MCDP_CD, D.DR_NAME, SUB.APNT_YMD
FROM (
    SELECT A.APNT_NO, P.PT_NAME, P.PT_NO, A.MDDR_ID, A.APNT_YMD
    FROM (
        SELECT APNT_NO, APNT_YMD, PT_NO, MDDR_ID, MCDP_CD
        FROM APPOINTMENT
        WHERE APNT_CNCL_YN = "N" AND MCDP_CD = "CS" AND APNT_YMD LIKE "2022-04-13%"
    ) AS A
    LEFT JOIN PATIENT P
    ON P.PT_NO = A.PT_NO
) AS SUB
LEFT JOIN DOCTOR D
ON SUB.MDDR_ID = D.DR_ID
ORDER BY SUB.APNT_YMD;
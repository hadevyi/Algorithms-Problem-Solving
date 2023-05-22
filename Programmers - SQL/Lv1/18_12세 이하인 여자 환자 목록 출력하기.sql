/**
 * 1. 문제정보
 *  - 제목 : 12세 이하인 여자 환자 목록 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/132201
 *  2. 풀이핵심
 *  - CASE의 사용
 * 3. 풀이후기
 *  - 아직 조금 어색하다. CASE END의 쌍은 이해했고, 그 내부의 WHEN-TEN과 ELSE에 대해서 더 익숙해져야겠다.
 */
SELECT P.PT_NAME, P.PT_NO, P.GEND_CD, P.AGE,
    CASE 
        WHEN P.TLNO IS NULL THEN "NONE"
        ELSE P.TLNO
    END AS TLNO
FROM PATIENT P
WHERE P.AGE <= 12 AND P.GEND_CD = "W"
ORDER BY P.AGE DESC, P.PT_NAME ASC;
/**
 * 1. 문제정보
 *  - 제목 : 그룹별 조건에 맞는 식당 목록 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131124
 *  2. 풀이핵심
 *  - 각 TABLE과 조건을 별도로 하기
 * 3. 풀이후기
 *  - 생각의 전환이였던 문제였다.
 */
SELECT P.MEMBER_NAME, R.REVIEW_TEXT, DATE_FORMAT(R.REVIEW_DATE, "%Y-%m-%d") AS REVIEW_DATE
FROM MEMBER_PROFILE P
JOIN (
    SELECT MEMBER_ID, REVIEW_TEXT, REVIEW_DATE, 
        COUNT(MEMBER_ID) OVER (PARTITION BY MEMBER_ID) AS CNT
    FROM REST_REVIEW
) AS R
ON R.MEMBER_ID = P.MEMBER_ID
WHERE R.CNT = (
    SELECT COUNT(*) AS CNT FROM REST_REVIEW
    GROUP BY MEMBER_ID ORDER BY CNT DESC LIMIT 1
)
ORDER BY REVIEW_DATE, R.REVIEW_TEXT
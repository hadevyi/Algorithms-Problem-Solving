/**
 * 1. 문제정보
 *  - 제목 : 서울에 위치한 식당 목록 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131118
 *  2. 풀이핵심
 *  - GROUP BY
 * 3. 풀이후기
 *  - GROUP BY로 처리를 해야 중복없이 출력될 수 있다.
 */
SELECT I.REST_ID, I.REST_NAME, I.FOOD_TYPE, I.FAVORITES, I.ADDRESS, ROUND(SUM(R.REVIEW_SCORE) / COUNT(R.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO I
RIGHT JOIN REST_REVIEW R
ON I.REST_ID = R.REST_ID
WHERE I.ADDRESS LIKE "서울%"
GROUP BY I.REST_ID
ORDER BY SCORE DESC, I.FAVORITES DESC
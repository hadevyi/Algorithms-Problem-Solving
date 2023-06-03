/**
 * 1. 문제정보
 *  - 제목 : 성분으로 구분한 아이스크림 총 주문량
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/133026
 *  2. 풀이핵심
 *  - AS로 컬럼명을 지정하는 방법과 JOIN하기
 * 3. 풀이후기
 *  - 다른 문제들에 비하면 간단한 문제
 */
SELECT I.INGREDIENT_TYPE, SUM(F.TOTAL_ORDER) AS "TOTAL_ORDER"
FROM FIRST_HALF F
JOIN ICECREAM_INFO I
ON F.FLAVOR = I.FLAVOR
GROUP BY I.INGREDIENT_TYPE
ORDER BY SUM(F.TOTAL_ORDER);
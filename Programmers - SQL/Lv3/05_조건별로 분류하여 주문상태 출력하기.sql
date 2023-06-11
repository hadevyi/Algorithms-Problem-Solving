/**
 * 1. 문제정보
 *  - 제목 : 조건별로 분류하여 주문상태 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131113
 *  2. 풀이핵심
 *  - CASE WHEN을 활용하는 문제
 * 3. 풀이후기
 *  - DATEDIFF를 비교하기 애매했지만, 생각보다 잘 구현되었다.
 */
SELECT F.ORDER_ID, F.PRODUCT_ID, DATE_FORMAT(F.OUT_DATE, "%Y-%m-%d") AS OUT_DATE,
    CASE
        WHEN F.OUT_DATE IS NULL THEN "출고미정"
        WHEN DATEDIFF(F.OUT_DATE, "2022-05-01") <= 0 THEN "출고완료"
        ELSE "출고대기"
    END AS "출고여부"
FROM FOOD_ORDER F
ORDER BY F.ORDER_ID;
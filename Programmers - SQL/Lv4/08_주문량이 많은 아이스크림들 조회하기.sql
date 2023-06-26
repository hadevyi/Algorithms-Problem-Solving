/**
 * 1. 문제정보
 *  - 제목 : 주문량이 많은 아이스크림들 조회하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/133027
 *  2. 풀이핵심
 *  - 테이블을 여러개 활용해 원하는 결과를 얻을 수 있다.
 * 3. 풀이후기
 *  - 만들어진 별도의 TABLE을 만들어주는 것에 익숙해지고 있다.
 */
SELECT J.FLAVOR
FROM (
    SELECT FLAVOR, SUM(TOTAL_ORDER) AS SUM
    FROM JULY
    GROUP BY FLAVOR
) AS J
JOIN (
    SELECT FLAVOR, SUM(TOTAL_ORDER) AS SUM
    FROM FIRST_HALF
    GROUP BY FLAVOR
) AS F
ON J.FLAVOR = F.FLAVOR
ORDER BY J.SUM + F.SUM DESC
LIMIT 3;
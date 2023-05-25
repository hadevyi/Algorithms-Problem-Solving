/**
 * 1. 문제정보
 *  - 제목 : 과일로 만든 아이스크림 고르기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/133025
 *  2. 풀이핵심
 *  - DISTINCT 사용하기
 * 3. 풀이후기
 *  - JOIN은 간단하게 진행할 수 있었다. 다만 중복이 없도록 출력하기 위해서는 DISTINCT를 써야하는데 이것이 어색했었다.
 */
SELECT DISTINCT(F.FLAVOR)
FROM FIRST_HALF F
JOIN ICECREAM_INFO I
ON F.FLAVOR = I.FLAVOR
WHERE F.TOTAL_ORDER > 3000 AND I.INGREDIENT_TYPE = "fruit_based"
ORDER BY F.TOTAL_ORDER DESC;
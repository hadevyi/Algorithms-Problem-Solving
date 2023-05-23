/**
 * 1. 문제정보
 *  - 제목 : 인기있는 아이스크림
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/133024
 *  2. 풀이핵심
 *  - ORDER BY 기준
 * 3. 풀이후기
 *  - 복합적인 ORDER를 하는 연습
 */
SELECT F.FLAVOR
FROM FIRST_HALF F
ORDER BY F.TOTAL_ORDER DESC, F.SHIPMENT_ID ASC;
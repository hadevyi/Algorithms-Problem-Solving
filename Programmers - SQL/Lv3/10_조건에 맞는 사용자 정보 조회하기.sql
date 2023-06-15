/**
 * 1. 문제정보
 *  - 제목 : 조건에 맞는 사용자 정보 조회하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/164670
 *  2. 풀이핵심
 *  - IN과 GROUP BY를 함께 활용
 * 3. 풀이후기
 *  - 복잡하고 헷갈리는 내용이 많았지만, 그래도 잘 풀수 있었다.
 */
SELECT B.WRITER_ID, U.NICKNAME, 
    CONCAT(U.CITY, " ", U.STREET_ADDRESS1, " ", U.STREET_ADDRESS2) AS "전체주소",
    CONCAT(SUBSTR(U.TLNO, 1, 3), "-", SUBSTR(U.TLNO, 4, 4), "-", SUBSTR(U.TLNO, 8, 4)) AS "전화번호"
FROM USED_GOODS_BOARD B
LEFT JOIN USED_GOODS_USER U
ON B.WRITER_ID = U.USER_ID
WHERE (B.WRITER_ID)
    IN
    (
        SELECT U.USER_ID
        FROM USED_GOODS_BOARD B
        LEFT JOIN USED_GOODS_USER U
        ON U.USER_ID = B.WRITER_ID
        GROUP BY U.USER_ID
        HAVING COUNT(*) >= 3
    )
GROUP BY U.USER_ID
ORDER BY U.USER_ID DESC;
/**
 * 1. 문제정보
 *  - 제목 : 조건에 부합하는 중고거래 상태 조회하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/164672
 *  2. 풀이핵심
 *  - CASE, WHEN을 활용하기
 * 3. 풀이후기
 *  - AS로 활용하면 더 간단하게 진행할 수 있음에 유의하자.
 */
SELECT U.BOARD_ID, U.WRITER_ID, U.TITLE, U.PRICE, 
    CASE 
        WHEN U.STATUS = "SALE" THEN "판매중"
        WHEN U.STATUS = "RESERVED" THEN "예약중"
        WHEN U.STATUS = "DONE" THEN "거래완료"
    END AS "STATUS"
FROM USED_GOODS_BOARD U
WHERE YEAR(U.CREATED_DATE) = 2022 AND MONTH(U.CREATED_DATE) = 10 AND DAY(U.CREATED_DATE) = 5
ORDER BY U.BOARD_ID DESC;
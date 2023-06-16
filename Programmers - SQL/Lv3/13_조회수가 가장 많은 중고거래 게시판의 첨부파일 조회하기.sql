/**
 * 1. 문제정보
 *  - 제목 : 조회수가 가장 많은 중고거래 게시판의 첨부파일 조회하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/164671
 *  2. 풀이핵심
 *  - CONCAT 핵심
 * 3. 풀이후기
 *  - 놓친부분은 있었지만 어렵지는 않은 문제
 */
SELECT CONCAT("/home/grep/src/", B.BOARD_ID, "/", F.FILE_ID, FILE_NAME, FILE_EXT) AS "FILE_PATH"
FROM USED_GOODS_BOARD B
LEFT JOIN USED_GOODS_FILE F
ON B.BOARD_ID = F.BOARD_ID
WHERE B.VIEWS IN (
    SELECT MAX(VIEWS)
    FROM USED_GOODS_BOARD
)
ORDER BY F.BOARD_ID DESC;
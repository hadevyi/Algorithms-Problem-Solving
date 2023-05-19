/**
 * 1. 문제정보
 *  - 제목 : 조건에 부합하는 중고거래 댓글 조회하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/164673
 *  2. 풀이핵심
 *  - join 하는 것도 처음이였고 조건의 데이터 포맷을 변경하는 것이 처음이라 낯설었다.
 * 3. 풀이후기
 *  - join에 on을 같이 쓰는 것도 익숙해져야겠다. 더 많이 사용될텐데 이렇게 어색할 줄이야
 */
SELECT B.TITLE, B.BOARD_ID, P.REPLY_ID, P.WRITER_ID, P.CONTENTS, DATE_FORMAT(P.CREATED_DATE, "%Y-%m-%d") AS CREATED_DATE
FROM USED_GOODS_BOARD B
JOIN USED_GOODS_REPLY P
ON B.BOARD_ID = P.BOARD_ID 
WHERE YEAR(B.CREATED_DATE) = 2022 AND MONTH(B.CREATED_DATE) = 10
ORDER BY P.CREATED_DATE, B.TITLE;
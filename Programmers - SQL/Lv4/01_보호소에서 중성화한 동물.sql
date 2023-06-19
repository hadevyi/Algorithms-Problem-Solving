/**
 * 1. 문제정보
 *  - 제목 : 보호소에서 중성화한 동물
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/59045
 *  2. 풀이핵심
 *  - 각 조건에 맞게 join과 where하는 것이 중요
 * 3. 풀이후기
 *  - out 데이터가 존재했을 때를 기준으로 봐야해서 left join을 했다. 그 외에는 기본적인 like를 활용했기에 어렵지 않았다.
 */
SELECT I.ANIMAL_ID, O.ANIMAL_TYPE, O.NAME
FROM ANIMAL_INS I
LEFT JOIN ANIMAL_OUTS O
ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE (O.ANIMAL_ID IS NOT NULL) AND (I.SEX_UPON_INTAKE LIKE "Intact%") AND (O.SEX_UPON_OUTCOME NOT LIKE "Intact%")
ORDER BY I.ANIMAL_ID;
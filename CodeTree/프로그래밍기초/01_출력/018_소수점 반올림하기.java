import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 소수점 반올림하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/rounding-decimal-points/description
 *  2. 풀이핵심
 *  - Math.round
 * 3. 풀이후기
 *  - 자바로 반올림하는거 굉장히 오랜만이여서 헤맸다.
 */
public class Main {
    public static void main(String[] args) {
        double a = 25.352;
        System.out.println((Math.round(a * 10) / 10.0));
    }
}
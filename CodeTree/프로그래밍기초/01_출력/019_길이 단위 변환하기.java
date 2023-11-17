import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 길이 단위 변환하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/change-length-unit/description
 *  2. 풀이핵심
 *  - 간단한 연산
 * 3. 풀이후기
 *  - 반올림과 같이하는 연산
 */
public class Main {
    public static void main(String[] args) {
        double ft = 9.2, mi = 1.3;
        System.out.println(ft + "ft = " + (Math.round(ft * 30.48 * 10) / 10.0) + "cm");
        System.out.println(mi + "mi = " + (mi * 160934) + "cm");
    }
}
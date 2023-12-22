import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 차례로 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-in-order/description
 * 2. 풀이핵심
 *  - 간단한 반복문
 * 3. 풀이후기
 *  - 출력하기 위해 StringBuffer를 활용했다.
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        StringBuffer sb = new StringBuffer();
        for (int i = 5;i <= 17;i++) sb.append(i).append(" ");
        System.out.println(sb.toString());
    }
}
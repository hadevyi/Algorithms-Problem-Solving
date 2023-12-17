import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 남녀노소 구분짓기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sex-and-age/description
 * 2. 풀이핵심
 *  - 복합 조건문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int gender = Integer.parseInt(br.readLine());
        int age = Integer.parseInt(br.readLine());

        String result = null;
        if (gender == 0 && age >= 19) result = "MAN";
        else if (gender == 0 && age < 19) result = "BOY";
        else if (gender == 1 && age >= 19) result = "WOMAN";
        else result = "GIRL";

        System.out.println(result);
    }
}
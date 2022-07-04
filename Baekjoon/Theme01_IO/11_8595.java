import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 1. 문제정보
 *  - 제목 : 히든 넘버
 *  - 번호 : 8595
 *  - 링크 : https://www.acmicpc.net/problem/8595
 * 2. 풀이핵심
 *  - 연속된 수 문자의 숫자 표기
 *  - 알파벳과 수 구별하기
 * 3. 풀이후기
 *  - 무려 4번이나 틀렸다... 메인 로직은 처음부터 작성했는데, result의 자료형을 제대로 설정하지 못했다.
 *  - 주어지는 단어의 길이가 5,000,000임을 제대로 확인하지 않았다. int의 최대 값은 2,147,483,647이 최대고 길이는 10이다.
 *  - 첫 시작이 3이고 길이가 10인 수 하나만 와도 int의 값은 초과한다. 이제는 주어진 조건을 더 꼼꼼히 보는 습관을 가져야할 것같다.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long result = 0;
        int num = 0;

        for (int i = 0;i < len;i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            } else if (num != 0) {
                result += num;
                num = 0;
            }
        }

        if (num != 0)
            result += num;

        System.out.println(result);
    }
}
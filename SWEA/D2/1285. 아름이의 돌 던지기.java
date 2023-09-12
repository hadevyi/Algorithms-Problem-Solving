import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1285. 아름이의 돌 던지기
 *  2. 풀이핵심
 *  - 최소 값을 갱신, 카운트
 * 3. 풀이후기
 *  - C++ 밖에 채점 언어가 없어 Java 언어에서 C++ 언어를 CharGPT로 변환했다.
 */
public class Solution {

    public static int T, N, CLOSED, COUNT;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());
            CLOSED = 100001;
            COUNT = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++) {
                int num = Math.abs(Integer.parseInt(st.nextToken()));

                if (CLOSED > num) {
                    CLOSED = num;
                    COUNT = 1;
                } else if (CLOSED == num) COUNT++;
            }

            sb.append(CLOSED).append(" ").append(COUNT);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}

/**
#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

int T, N, CLOSED, COUNT;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    cin >> T;

    for (int t = 1; t <= T; t++) {
        cout << "#" << t << " ";
        cin >> N;
        CLOSED = 100001;
        COUNT = 0;

        for (int n = 0; n < N; n++) {
            int num;
            cin >> num;
            num = abs(num);

            if (CLOSED > num) {
                CLOSED = num;
                COUNT = 1;
            } else if (CLOSED == num) {
                COUNT++;
            }
        }

        cout << CLOSED << " " << COUNT;

        if (t < T) {
            cout << "\n";
        }
    }

    return 0;
}
*/
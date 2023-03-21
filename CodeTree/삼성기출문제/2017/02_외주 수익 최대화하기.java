import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 외주 수익 최대화하기
 *  - 출처 : 삼성SW역량테스트 2017 상반기 오전 2번 문제
 *  - 링크 : https://www.codetree.ai/training-field/frequent-problems/max-of-outsourcing-profit/description?page=1&pageSize=20&username=
 *  2. 풀이핵심
 *  - 각 일을 시작할 수 있는 시간과 마칠 수 있는 시간이 정해져있음. 이 조건을 정리해 진행함
 * 3. 풀이후기
 *  - 총 외주 일정이 지나면 return 해버리는 식으로 진행함.
 *  - 모든 경우가 등장하니 조합보다는 for의 조건을 달아서 진행하였음.
 */
public class Main {

    public static int N, MAX;
    public static Job[] jobs;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MAX = Integer.MIN_VALUE;
        N = Integer.parseInt(br.readLine());
        jobs = new Job[N];

        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            jobs[n] = new Job(n, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        getMaxPayJob(0, 0, 0);

        System.out.println(MAX);
    }

    public static void getMaxPayJob(int index, int last_days, int total_pays) {
        if (last_days > N) {
            return;
        }

        if (index == N) {
            if (last_days <= N)
                MAX = Integer.max(MAX, total_pays);
            return;
        }

        for (int n = index;n < N;n++) {
            getMaxPayJob(n + 1, last_days, total_pays);
            if (last_days <= jobs[n].startT)
                getMaxPayJob(n + 1, jobs[n].endT, total_pays + jobs[n].p);
        }
    }

    public static class Job {
        public int startT; // 시작일자
        public int endT; // 마지막일자
        public int p; // 수익

        public Job(int n, int t, int p) {
            this.startT = n;
            this.endT = n + t;
            this.p = p;
        }
    }
}

import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 불안한 무빙워크
 *  - 출처 : 삼성SW역량테스트 2020 하반기 오전 1번 문제
 *  - 링크 : https://www.codetree.ai/training-field/frequent-problems/unstable-moving-walk/description?page=2&pageSize=20&username=
 *  2. 풀이핵심
 *  - 단계를 확인해서 구현하기
 * 3. 풀이후기
 *  - class method를 촘촘히 구현한것이 오히려 더 쉬웠음
 */
public class Main {

    public static int N, K; // 길이, 종료 조건
    public static ArrayList<MovingWork> movingWorkArrayList;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        movingWorkArrayList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int n = 0;n < 2 * N;n++)
            movingWorkArrayList.add(new MovingWork(n, Integer.parseInt(st.nextToken())));

        int count = 0;
        while (!isMore()) {
            // 무빙워크 한 칸 회전
            movingJustOne();

            if (movingWorkArrayList.get(N - 1).isPerson)
                movingWorkArrayList.get(N - 1).donePerson();

            for (int i = N - 2;i >= 0;i--) {
                if (!movingWorkArrayList.get(i).isPerson) continue;
                if (!movingWorkArrayList.get(i + 1).canPerson()) continue;

                movingWorkArrayList.get(i + 1).setPerson();
                movingWorkArrayList.get(i).donePerson();
            }

            if (movingWorkArrayList.get(N - 1).isPerson)
                movingWorkArrayList.get(N - 1).donePerson();

            if (movingWorkArrayList.get(0).canPerson())
                movingWorkArrayList.get(0).setPerson();

            count++;
        }

        System.out.println(count);
    }

    public static void movingJustOne() {
        ArrayList<MovingWork> temp = new ArrayList<>();
        temp.add(movingWorkArrayList.get(movingWorkArrayList.size() - 1));
        for (int i = 0;i < movingWorkArrayList.size() - 1;i++)
            temp.add(movingWorkArrayList.get(i));
        movingWorkArrayList = temp;
    }

    public static boolean isMore() {
        int count = 0;
        for (MovingWork m : movingWorkArrayList)
            if (m.safePoint == 0)
                count++;
        return count >= K;
    }
    public static class MovingWork {
        int number;
        int safePoint;
        boolean isPerson;

        public MovingWork(int number, int safePoint) {
            this.number = number;
            this.safePoint = safePoint;
            this.isPerson = false;
        }

        public boolean canPerson() {
            return safePoint > 0 && !isPerson;
        }

        public void setPerson() {
            this.isPerson = true;
            this.safePoint--;
        }

        public void donePerson() {
            this.isPerson = false;
        }
    }
}

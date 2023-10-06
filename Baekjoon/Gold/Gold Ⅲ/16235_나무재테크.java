import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 나무 재테크
 *  - 번호 : 16235
 *  - 링크 : https://www.acmicpc.net/problem/16235
 *  2. 풀이핵심
 *  - 시간단축을 해결하는 방법
 * 3. 풀이후기
 *  - 구간을 나눠 해결하는 것보다 시간을 단축할 수 있는 방법을 찾는 것이 더 오래걸린 문제였다.
 */
public class Main {

    public static int N;                    // 땅의 한 변의 길이 (1 <= N <= 10)
    public static int M;                    // 나무의 개수 (1 <= M <= 100)
    public static int K;                    // 확인해야하는 시간 (1 <= K <= 1000)
    public static int DEFAULT_NUTRIMENT = 5;// 첫 양분의 기본 값
    public static int[][] NUTRIMENT, ADD;   // 현재 양분 및 추가 양분 값
    public static List<Tree> TREE_LIST;     // 살아있는 나무 정보
    public static void main(String[] args) throws Exception {
        init();

        for (int k = 0;k < K;k++) {
            if (TREE_LIST.isEmpty()) break; // 더이상 트리가 존재하지 않는다면, 검사하지 않는다.
            summer(spring());
            fall();
            winter();
        }

        System.out.println(TREE_LIST.size());
    }

    /**
     * 봄(spring)
     * 나무가 자신의 나이만큼 양분을 먹고, 나이가 1 증가한다. 각각의 나무는 나무가 있는 1×1 크기의 칸에 있는 양분만 먹을 수 있다.
     * 하나의 칸에 여러 개의 나무가 있다면, 나이가 어린 나무부터 양분을 먹는다.
     * 만약, 땅에 양분이 부족해 자신의 나이만큼 양분을 먹을 수 없는 나무는 양분을 먹지 못하고 즉시 죽는다.
     * @return  : 봄 단계의 결과 죽은 나무의 정보들
     */
    public static Queue<Tree> spring() {
        Queue<Tree> deadTree = new LinkedList<>();  // 죽은 나무만 모아서 처리한다.

        for (Tree tree : TREE_LIST) {
            if (NUTRIMENT[tree.x][tree.y] >= tree.age) {
                NUTRIMENT[tree.x][tree.y] -= tree.age;
                tree.age++;
            } else {
                deadTree.offer(tree);
            }
        }

        return deadTree;
    }

    /**
     * 여름(summer)
     * 봄에 죽은 나무가 양분으로 변하게 된다.
     * 각각의 죽은 나무마다 나이를 2로 나눈 값이 나무가 있던 칸에 양분으로 추가된다.
     * 소수점 아래는 버린다.
     * @param deadTree  : 죽은 나무 정보들
     */
    public static void summer(Queue<Tree> deadTree) {
        while (!deadTree.isEmpty()) {
            Tree tree = deadTree.poll();
            NUTRIMENT[tree.x][tree.y] += tree.age / 2;
            tree.isDead = true; // 죽음 처리
        }
    }

    /**
     * 가을(fall)
     * 나무가 번식한다.
     * 번식하는 나무는 나이가 5의 배수이어야 하며, 인접한 8개의 칸에 나이가 1인 나무가 생긴다.
     * 어떤 칸 (r, c)와 인접한 칸은 (r-1, c-1), (r-1, c), (r-1, c+1), (r, c-1), (r, c+1), (r+1, c-1), (r+1, c), (r+1, c+1) 이다.
     * 상도의 땅을 벗어나는 칸에는 나무가 생기지 않는다.
     */
    public static int D = 8;
    public static int[][] DELTA = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    public static void fall() {
        List<Tree> newTree = new ArrayList<>();

        for (Tree tree : TREE_LIST) {
            if (tree.isDead) continue;          // 나무가 이미 죽어있다면 번식 불가능
            if (tree.age % 5 != 0) continue;    // 나무의 나이가 5의 배수가 아니면 번식 불가능

            for (int d = 0;d < D;d++) {
                int nx = tree.x + DELTA[d][0];
                int ny = tree.y + DELTA[d][1];

                if (nx < 1 || ny < 1 || nx > N || ny > N) continue; // 상도의 땅을 벗어나면 불가능

                newTree.add(new Tree(nx, ny, 1)); // 항상 나이가 1이 먼저이기 때문에 newTree에 먼저 추가
            }
        }

        for (Tree tree : TREE_LIST) {   // 나이가 어떻게 되었든, 기존 나무는 새로운 나무보다는 뒤에 배치
            if (tree.isDead) continue;  // 죽은 나무 제외
            newTree.add(tree);
        }

        TREE_LIST = newTree;            // 나무 리스트를 최신 정보로 교체
    }

    /**
     * 겨울(winter)
     * S2D2가 땅을 돌아다니면서 땅에 양분을 추가한다.
     * 각 칸에 추가되는 양분의 양은 A[r][c]이고, 입력으로 주어진다.
     * */
    public static void winter() {
        for (int n = 1;n <= N;n++)
            for (int m = 1;m <= N;m++)
                NUTRIMENT[n][m] += ADD[n][m];
    }

    public static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        NUTRIMENT = new int [N + 1][N + 1];
        ADD = new int [N + 1][N + 1];

        for (int n = 1;n <= N;n++) {
            st = new StringTokenizer(br.readLine());
            for (int m = 1; m <= N; m++) {
                ADD[n][m] = Integer.parseInt(st.nextToken());   // 추가로 들어올 값 세팅
                NUTRIMENT[n][m] = DEFAULT_NUTRIMENT;            // 초기 값 세팅
            }
        }

        TREE_LIST = new ArrayList<>();
        for (int m = 0;m < M;m++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int age = Integer.parseInt(st.nextToken());

            Tree tree = new Tree(x, y, age);
            TREE_LIST.add(tree);
        }
        Collections.sort(TREE_LIST);    // 나무의 나이를 오름차순으로 정렬
    }

    public static class Tree implements Comparable<Tree> {
        int x, y, age;
        boolean isDead;

        public Tree(int x, int y, int age) {
            this.x = x;
            this.y = y;
            this.age = age;
            this.isDead = false;
        }

        @Override
        public int compareTo(Tree o) {
            return this.age - o.age;
        }
    }
}

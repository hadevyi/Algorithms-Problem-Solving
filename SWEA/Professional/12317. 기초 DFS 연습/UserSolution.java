public class UserSolution {

    public Node[] nodes;
    public int MAX_COUNT = 100;

    /**
     * 각 테스트케이스 시작 시 초기화를 위해 1번 호출된다.
     *
     * @param N : 인물 수 (2 <= N <= 40)
     * @param path : 관계도
     **/
    public void dfs_init(int N, int[][] path) {
        nodes = new Node[MAX_COUNT];

        for (int n = 0;n < N;n++) {
            int p = path[n][0];
            int c = path[n][1];

            if (nodes[p] == null) {
                nodes[p] = new Node(c);
            } else {
                Node now = nodes[p];
                while (now.next != null)
                    now = now.next;
                now.next = new Node(c);
            }
        }
    }

    /**
     * 능력 n을 가지는 인물이 왕이 되었을 경우, 왕위를 계승할 인물의 능력을 반환한다.
     *
     * @param N : 능력 (1 <= N <= 99)
     * @return 인물의 능력, 없으면 -1
     **/
    public int dfs(int N) {
        return findNextKing(N, N); // 없으면 반환하는 값
    }

    private int findNextKing(int value, int standardValue) {
        if (value > standardValue) return value; // 이 값이 왕위를 이를 사람인지 확인
        if (nodes[value] == null) return -1; // 다음이 없다면, 종료

        Node now = nodes[value];
        int answer = -1;
        while (now != null) {
            int temp = findNextKing(now.data, standardValue);
            if (temp > -1) {
                answer = temp;
                break;
            }
            now = now.next;
        }
        return answer;
    }
}
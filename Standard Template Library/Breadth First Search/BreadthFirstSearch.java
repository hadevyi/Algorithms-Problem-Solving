public class BreadthFirstSearch {

    public int N;
    public Queue queue;
    public int[][] MAP;
    public boolean[][] isVisited;

    /**
     * 행과 열의 크기가 map_size(1 <= map_size <= 10) 인 지도가 주어진다.
     * 지도는 0-base인 배열로 표현되며 map[10][10] 으로 주어진다.
     * 배열의 각 값들은 0 또는 1이며 '0'은 길을, '1'은 벽을 의미한다.
     *
     * @param map_size 행과 열의 크기
     * @param map 지도 정보
     * */
    void bfs_init(int map_size, int map[][]) {
        N = map_size;
        MAP = new int[N][N];

        for (int n = 0;n < N;n++)
            for (int m = 0;m < N;m++)
                MAP[n][m] = map[n][m];
    }

    /**
     * 시작점 x1, y1 좌표가 주어지고 도착점 x2, y2가 주어지면 시작점에서 도착점까지 가는데
     * 최단 거리로 갈 경우 몇 번을 이동하면 되는지 이동 횟수를 계산해서 return해야 한다.
     *
     * x는 열이고 y는 행임을 주의해야 한다. 그리고 좌상 좌표는 x=1, y=1 이다.
     * 만약 만약 갈 수 있는 방법이 없을 경우 -1을 return해야 한다.
     * 시작점과 도착점이 같은 경우는 없다.
     *
     * @param x1 시작점 x - 열
     * @param y1 시작점 y - 행
     * @param x2 도착점 x - 열
     * @param y2 도착점 y - 행
     * @return 최단 거리, 도달할 수 없으면 -1
     * */
    int D = 4;
    int[][] DELTA = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int bfs(int x1, int y1, int x2, int y2) {
        x1--; y1--; x2--; y2--;
        queue = new Queue();
        isVisited = new boolean[N][N];

        for (int n = 0;n < N;n++)
            for (int m = 0;m < N;m++)
                isVisited[n][m] = false;

        int count = 0;
        isVisited[y1][x1] = true;
        queue.enqueue(new Node(y1, x1));

        while (queue.size > 0) {
            int SIZE = queue.size;
            count++;

            for (int size = 0;size < SIZE;size++) {
                Node node = queue.dequeue();

                for (int d = 0;d < D;d++) {
                    int ni = node.i + DELTA[d][0];
                    int nj = node.j + DELTA[d][1];

                    if (ni < 0 || nj < 0 || ni >= N || nj >= N) continue;
                    if (isVisited[ni][nj] || MAP[ni][nj] != 0) continue;

                    if (ni == y2 && nj == x2) return count;

                    queue.enqueue(new Node(ni, nj));
                    isVisited[ni][nj] = true;
                }
            }
        }

        return -1;
    }
}

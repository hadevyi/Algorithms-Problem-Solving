package first;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {
	static int T, N, TOTAL;
	static int[][] map;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) { // 전체 테스트 만큼 수행
			TOTAL = 0;
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			List<int[]> list = new ArrayList<>(); // 검사할 프로세스를 저장할 list 목록

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());

					if (!(i == 0 || i == N - 1 || j == 0 || j == N - 1) && map[i][j] == 1) {
						// 가장가지가 아닌 프로세스일 경우 list에 현재 i, j를 저장함
						list.add(new int[] { i, j });
					}
				}
			}

			int[] canLength = new int[list.size()]; // 직선으로 놓을 수 있는 선의 갯수를 저장할 배열
			int[] checkOrder = new int[list.size()]; // 가능한 선을 작은 순서대로 프로세서의 index를 저장할 배열
			int min = N;
			for (int i = 0; i < list.size(); i++) { // 검사할 프로세스를 모두 확인함
				int cnt = 0; // 가능한 직선의 방향을 cnt할 변수
				for (int d = 0; d < D; d++) { // 한방향씩 놓아본다.
					if (processLength(list.get(i)[0], list.get(i)[1], 0, d) != 999) { // 해당이 999(놓을 수 없음)이 아니면 count함
						cnt++;
						// System.out.println(list.get(i)[0] + " " + list.get(i)[1] + " " + "process 놓기 가능 :" + d + "방향");
					}
				}
				canLength[i] = cnt; // list의 순서대로 현재 가능 방향을 배열에 정리함
				min = Math.min(cnt, min); // checkOrder의 배치 회전을 최소화하기 위해 최소 방향의 수를 미리 구해둠
			}

			//System.out.println(min);
			
			// 제일 가능성이 적은 프로세스의 index를 찾아서 배치한다.
			int idx = 0;
			while (idx < list.size()) { // 전체 list를 정리할때까지 반복한다.
				for (int i = 0; i < list.size(); i++) {
					if (min == canLength[i])
						checkOrder[idx++] = i;
				}
				min++; // 다음으로 작은 수를 찾는다.
			}

			for (int i : checkOrder) { // 정리한 순서대로 놓는다.
				int length = Integer.MAX_VALUE;
				int shortIndex = -1; // 최소 길이를 갖고 있는 방향 index를 저장할 변수

				for (int d = 0; d < D; d++) {
					int temp = processLength(list.get(i)[0], list.get(i)[1], 0, d); // 현재 방향으로 확인하며 길이를 구한다.
					if (temp < length) { // 길이가 더 짧은 배치가 있다면,
						length = temp; // 현재의 길이로 갱신하며
						shortIndex = d; // 최소 길이를 갖는 방향을 저장한다.
					}
				}

				if (length != 999) { // 최종 정리 결과 999(놓을 수 없음) 이 아니라면
					TOTAL += length; // 현재의 length를 TOTAL에 중첩함
					checkProcess(list.get(i)[0], list.get(i)[1], shortIndex); // 다음 프로세서 배치가 중복할 수 없도록 체크해둔다.
				} 
			}

			//System.out.println(Arrays.toString(canLength));
			//System.out.println(Arrays.toString(checkOrder));
			System.out.println("#" + t + " " + TOTAL);
		}
	}

	static int[][] DELTA = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } }; // 방향 델타
	static int D = 4; // 델타의 길이

	private static int processLength(int i, int j, int len, int dict) {
		int ni = i + DELTA[dict][0];
		int nj = j + DELTA[dict][1];

		if (ni < 0 || ni >= N || nj < 0 || nj >= N)
			return len; // 무리없이 map의 영역 밖으로 도달할 경우 현재의 len을 반환
		if (map[ni][nj] == 1 || map[ni][nj] == 2)
			return 999; // 프로세서가 있거나 회선이 있을 경우 999를 반환

		return processLength(ni, nj, len + 1, dict); // 아직 진행 중이라면 재귀 호출
	}

	private static void checkProcess(int i, int j, int dict) {
		int ni = i + DELTA[dict][0];
		int nj = j + DELTA[dict][1];

		if (ni < 0 || ni >= N || nj < 0 || nj >= N) // map 영역 밖으로 도달하면 종료
			return;

		map[ni][nj] = 2;
		checkProcess(ni, nj, dict); // 아직 진행 중이라면 재귀 호출
	}
}

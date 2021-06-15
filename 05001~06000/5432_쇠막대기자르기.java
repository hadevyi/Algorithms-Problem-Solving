package supplement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PipeCut_5432 {
	static int T, N, RESULT;
	static Stack<Integer> pipe = new Stack<>();
	static Queue<Integer> laser = new LinkedList<>();

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Pipe_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder("");

		T = Integer.parseInt(br.readLine());

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			str.delete(0, N);
			pipe.clear(); // 스택 초기화
			laser.clear(); // 레이저 초기화
			String pipeData = br.readLine(); // 파이프 입력 후 char 배열
			N = pipeData.length(); // 호출을 줄일 수 있도록 N 초기화
			//System.out.println(Arrays.toString(pipeData));
			RESULT = 0;

			for (int i = 0; i < N; i++) {
				if (pipeData.charAt(i) == '(') {
					// System.out.print(i + " ");
					pipe.push(i);
				} else {
					int pipeStartIdx = pipe.peek();

					if (i - pipeStartIdx == 1) {// 레이저일 때
						// System.out.print("(L) : " + pipeStartIdx);
						laser.offer(pipeStartIdx); // 레이저의 시작인덱스를 laser
						if(!pipe.isEmpty()) pipe.pop();
					} else { // 파이프일 때
						int count = 0, check = 0;

						while (check < laser.size()) {int tempIdx=0;
							if(!laser.isEmpty()) 
								tempIdx = laser.poll();
							if(pipeStartIdx<=tempIdx&&tempIdx<i)
								count++;
							laser.offer(tempIdx);
							check++;
						}
						RESULT += count;
						RESULT+=1;
						pipe.pop();
					}
				}

			}
			str.append("#").append(oneCase).append(" ").append(RESULT);
			System.out.println(str);
		}
	}
}

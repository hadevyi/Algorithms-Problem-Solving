import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 병원 거리 최소화하기
 *  - 출처 : 삼성SW역량테스트 2018 상반기 오후 2번 문제
 *  - 링크 : https://www.codetree.ai/training-field/frequent-problems/min-of-hospital-distance/description?page=1&pageSize=20&username=
 *  2. 풀이핵심
 *  - 선정한 병원에서 각 사람별 최소 거리의 합이 가장 작은 값
 * 3. 풀이후기
 *  - 문제 이해가 까다로웠다. 사람의 모든 거리 합의 최소인 줄 알았으나 추가적인 단계가 있었다.
 *  - 조금 더 명확한 설명이나 예시가 있었으면 좋았을 것같다.
 */
public class Main {

    public static int N, M, MIN; // N : map의 한변의 크기, M : 병원 선정 개수
    public static int[] indexList; // 병원 별 거리 합, 선정한 순번
    public static ArrayList<Point> persons, hospitals;
    public static void main(String[] args) throws Exception {
        // 0 빈 칸, 1 사람, 2 병원
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        MIN = Integer.MAX_VALUE;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        persons = new ArrayList<>();
        hospitals = new ArrayList<>();

        for (int i = 0;i < N;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0;j < N;j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 1) persons.add(new Point(i, j));
                else if (num == 2) hospitals.add(new Point(i, j));
            }
        }

        indexList = new int[M];
        combination(0, 0);

        System.out.println(MIN);
    }

    public static int point2pint(Point p1, Point p2) {
        return Math.abs(p2.i - p1.i) + Math.abs(p2.j - p1.j);
    }


    public static void combination(int srcIdx, int tgtIdx) {
        if (tgtIdx == M) {
            int result = 0;
            for (Point p : persons) {
                int min = Integer.MAX_VALUE;
                for (int idx : indexList) {
                    min = Math.min(min, point2pint(p, hospitals.get(idx)));
                }
                result += min;
            }
            MIN = Math.min(MIN, result);
            return;
        }

        for (int i = srcIdx;i < hospitals.size();i++) {
            indexList[tgtIdx] = i;
            combination(i + 1, tgtIdx + 1);
        }
    }

    public static class Point {
        int i;
        int j;
        public Point(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
}

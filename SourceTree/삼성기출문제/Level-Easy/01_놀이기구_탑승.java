import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 놀이기구 탑승
 *  - 기출 : 삼성SW역량테스트 상반기 2021년 오전 1번 문제
 *  - 난도 : 쉬움
 *  - 링크 : https://www.codetree.ai/frequent-problems/go-on-the-rides/description
 *  2. 풀이핵심
 *  - 적절한 자료구조를 통해 우선순위를 고려해 진행하기
 * 3. 풀이후기
 *  - Map을 오랜만에 사용해서 고생했던 문제, 인덱싱이 없다는 것을 잊었음
 *  - Map의 Key-Value의 편리함과 4방향 검사 델타를 활용하였음
 */
public class Main {
    static int N; // 3 ~ 20
    static int[][] map;
    static Student[] dataList; // N*N 길이
    static Map<Integer, ArrayList<Integer>> dataMap;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 초기화
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        dataList = new Student[N*N];
        dataMap = new HashMap<Integer, ArrayList<Integer>>();

        // 입력받기
        for (int n = 0;n < N*N;n++) {
            st = new StringTokenizer(br.readLine());

            int key = Integer.parseInt(st.nextToken());
            int[] list = new int[4];
            ArrayList<Integer> arrayList = new ArrayList<Integer>();

            for (int i = 0;i < 4;i++) {
                int num = Integer.parseInt(st.nextToken());
                list[i] = num;
                arrayList.add(num);
            }

            dataList[n] = new Student(key, list);
            dataMap.put(key, arrayList);
        }

        // 순서대로 넣으면서 검사 시작
        for (Student s : dataList) {
            ArrayList<Point> likeFriend = findLikeFriend(s);

            if (likeFriend.size() == 1) {
                // 1번 우선순위의 경우 : 인접한 좋아하는 친구가 많은 곳이 오직 하나인 경우
                map[likeFriend.get(0).x][likeFriend.get(0).y] = s.num;
            } else {
                // 2번 우선순위의 경우 : 1번의 내용들 중에서 인접한 곳의 빈 공간이 가장 많은 곳 확인
                // 2번 경우 중 행 번호가 가장 작거나, 다음으로는 열 번호가 가장 작은 것을 전달
                Point p = findEmptyPoint(likeFriend);
                map[p.x][p.y] = s.num;
            }
        }

        // 결과 확인
        System.out.println(resultSum());
    }

    static int[][] DELTA = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    public static int resultSum() {
        int[] score = new int[5];

        for (int i = 0;i < N;i++){
            for (int j = 0;j < N;j++) {
                int num = map[i][j];
                int count = 0;

                for (int d = 0;d < 4;d++) {
                    int ni = i + DELTA[d][0];
                    int nj = j + DELTA[d][1];

                    if (ni < 0 || ni >= N || nj < 0 || nj >= N || !dataMap.get(map[i][j]).contains(map[ni][nj])) continue;

                    count++;
                }

                score[count]++;
            }
        }

        return score[1] * 1 + score[2] * 10 + score[3] * 100 + score[4] * 1000;
    }

    public static ArrayList<Point> findLikeFriend(Student student) {
        // 현재 공간들 중 가장 최대의 빈 공간 반환
        int maxCount = Integer.MIN_VALUE;
        ArrayList<Point> pointArrayList = new ArrayList<Point>();

        for (int i = 0;i < N;i++) {
            for (int j = 0;j < N;j++) {
                int count = 0;

                // 이미 빈공간이 아니면 다음
                if (map[i][j] != 0) continue;

                for (int d = 0;d < 4;d++) {
                    int ni = i + DELTA[d][0];
                    int nj = j + DELTA[d][1];

                    // 경계선이 넘어가거나, 인접한 값이 좋아하는 친구의 번호가 아닌 경우 PASS
                    if (ni < 0 || ni >= N || nj < 0 || nj >= N || !student.isNumber(map[ni][nj])) continue;

                    count++;
                }

                if (maxCount < count) {
                    maxCount = count;
                    pointArrayList = new ArrayList<Point>();
                    pointArrayList.add(new Point(i, j));
                } else if (maxCount == count) pointArrayList.add(new Point(i, j));
            }
        }

        Collections.sort(pointArrayList);
        return pointArrayList;
    }

    public static Point findEmptyPoint(ArrayList<Point> pointArrayList) {
        ArrayList<Point> maxList = new ArrayList<Point>();
        int maxCount = Integer.MIN_VALUE;

        for (Point p : pointArrayList) {
            int count = 0;

            for (int d = 0;d < 4;d++) {
                int ni = p.x + DELTA[d][0];
                int nj = p.y + DELTA[d][1];

                if (ni < 0 || ni >= N || nj < 0 || nj >= N || map[ni][nj] != 0) continue;

                count++;
            }

            if (maxCount < count) {
                maxCount = count;
                maxList = new ArrayList<Point>();
                maxList.add(new Point(p.x, p.y));
            } else if (maxCount == count) maxList.add(new Point(p.x, p.y));
        }

        Collections.sort(maxList);
        return maxList.get(0);
    }

    public static class Student {
        int num;
        int[] like;

        public Student(int num, int[] like) {
            this.num = num;
            this.like = like;
        }

        public boolean isNumber(int closeNumber) {
            for (int i = 0;i < 4;i++)
                if (this.like[i] == closeNumber)
                    return true;
            return false;
        }
    }

    public static class Point implements Comparable<Point>{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x < o.x) return 1;
            else if (this.x > o.x) return -1;
            else {
                if (this.y < o.y) return 1;
                else if (this.y > o.y) return -1;
                else return 0;
            }
        }
    }
}

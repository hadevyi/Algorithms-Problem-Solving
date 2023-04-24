import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 다리를 지나는 트럭
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42583
 *  2. 풀이핵심
 *  - 데이터의 변화를 보고 있을 자료구조와 순서를 확인할 수 있는 자료구조를 별도로 생성했음
 * 3. 풀이후기
 *  - Sudo 코드로 간단하게 작성해서 진행했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(2, 10, new int[] {7,4,5,6})); // 8
        System.out.println(solution(100, 100, new int[] {10})); // 101
        System.out.println(solution(100, 100, new int[] {10,10,10,10,10,10,10,10,10,10})); // 110
    }
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> queue = new LinkedList<>();
        ArrayList<Truck> arrayList = new ArrayList<>();
        for (int i = 0;i < truck_weights.length;i++) {
            Truck truck = new Truck(i, truck_weights[i], bridge_length);
            arrayList.add(truck);
            queue.add(truck);
        }
        Deque<Truck> deque = new LinkedList<>();
        int answer = 0;

        while (arrayList.get(truck_weights.length - 1).isMore()) {
            answer++;
            if (!deque.isEmpty() && !deque.peekFirst().isMore())
                deque.pollFirst();

            if (!deque.isEmpty()) {
                int startIdx = deque.peekFirst().index;
                int endIdx = deque.peekLast().index;

                for (int i = startIdx;i <= endIdx;i++)
                    arrayList.get(i).minus();
            }

            int result = 0;

            if (!deque.isEmpty()) {
                int startIdx = deque.peekFirst().index;
                int endIdx = deque.peekLast().index;

                for (int i = startIdx;i <= endIdx;i++)
                    result += arrayList.get(i).weight;
            }

            if (!queue.isEmpty() && result + queue.peek().weight <= weight) {
                deque.offerLast(queue.poll());
                deque.peekLast().minus();
            }

            //print(answer, deque);
        }
        return answer + 1;
    }

    public static void print(int value, Deque<Truck> deque) {
        System.out.print(value+ " : ");
        int SIZE = deque.size();
        for (int size = 0;size < SIZE;size++) {
            Truck truck = deque.pollFirst();
            System.out.print(truck + "\t");
            deque.offerLast(truck);
        }
        System.out.println();
    }

    public static class Truck {
        int index;
        int weight;
        int length;

        public Truck(int index, int weight, int length) {
            this.index = index;
            this.weight = weight;
            this.length = length;
        }

        public void minus() {
            this.length -= 1;
        }

        public boolean isMore() {
            return length > 0;
        }

        @Override
        public String toString() {
            return this.index + " " + this.weight + " " + this.length;
        }
    }
}

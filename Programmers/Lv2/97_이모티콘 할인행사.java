import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 이모티콘 할인행사
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/150368
 *  2. 풀이핵심
 *  - 조건대로 프로그래밍하는 구현문제
 * 3. 풀이후기
 *  - 어렵다기보다는 조건에 대해서 정리해두기가 핵심이였다.
 */
class Solution {
    public int[] check;
    public ArrayList<int[]> checkList = new ArrayList<>();
    public int[] solution(int[][] users, int[] emoticons) {
        PriorityQueue<Service> pq = new PriorityQueue<>();
        check = new int[emoticons.length];
        setList(0);
        
        for (int[] discount : checkList) {
            int[] pay = new int[users.length]; // each user total pay
            
            for (int n = 0;n < users.length;n++) {
                for (int m = 0;m < discount.length;m++) {
                    if (discount[m] < users[n][0]) continue;
                    pay[n] += emoticons[m] - (emoticons[m] * discount[m] / 100);
                }
            }
            
            int person = 0, money = 0;
            for (int n = 0;n < users.length;n++) {
                if (users[n][1] <= pay[n]) person++;
                else money += pay[n];
            }
            
            pq.offer(new Service(person, money));
        }
        
        if (pq.isEmpty()) return new int[] {0, 0};
        Service service = pq.poll();
        return new int[] { service.person, service.money };
    }
    
    public void setList(int idx) {
        if (idx == check.length) {
            checkList.add(check.clone());
            return;
        }
        
        for (int n = 10;n <= 40;n += 10) {
            check[idx] = n;
            setList(idx + 1);
        }
    }
    
    public class Service implements Comparable<Service> {
        int person, money;
        public Service(int person, int money) {
            this.person = person;
            this.money = money;
        }
        @Override
        public int compareTo(Service o) {
            if (this.person == o.person)
                return o.money - this.money;
            return o.person - this.person;
        }
    }
}
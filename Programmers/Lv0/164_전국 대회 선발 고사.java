/**
 * 1. 문제정보
 *  - 제목 : 전국 대회 선발 고사
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181851
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i = 0;i < attendance.length;i++) {
            if (attendance[i])
                arrayList.add(new Student(i, rank[i]));
        }
        Collections.sort(arrayList);
        Student a = arrayList.get(arrayList.size() - 1);
        Student b = arrayList.get(arrayList.size() - 2);
        Student c = arrayList.get(arrayList.size() - 3);
        return 10000 * a.order + 100 * b.order + c.order;
    }
    
    public class Student implements Comparable<Student> {
        int order;
        int number;
        
        public Student(int order, int number) {
            this.order = order;
            this.number = number;
        }
        
        @Override
        public int compareTo(Student o) {
            return o.number - this.number;
        }
    }
}
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 주차 요금 계산
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/92341
 *  2. 풀이핵심
 *  - 순서 쌍을 매칭해야하며, OUT이 없으면 23:59가 해당 정보임
 * 3. 풀이후기
 *  - 순서 쌍 매칭에서 오류가 나, 추가적인 속성을 만들어서 진행했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {180, 5000, 10, 600}, new String[] {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"}))); // [14600, 34400, 5000]
        System.out.println(Arrays.toString(solution(new int[] {120, 0, 60, 591}, new String[] {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"}))); // [0, 591]
        System.out.println(Arrays.toString(solution(new int[] {1, 461, 1, 10}, new String[] {"00:00 1234 IN"}))); // [14841]
    }

    public static int[] solution(int[] fees, String[] records) {
        // recodreds[i] = "시각 차량번호 내역" / 내역 IN OUT
        // OUT이 없으면 23:59에 나간걸로 침
        int N = records.length;
        ArrayList<Car> cars = new ArrayList<>();

        // 입력 받기
        for (String record : records) {
            StringTokenizer st = new StringTokenizer(record);
            String time = st.nextToken();
            String number = st.nextToken();
            String type = st.nextToken();

            if (type.equals("IN")) {
                cars.add(new Car(number, time));
            } else {
                for (Car car : cars) {
                    if (car.number.equals(number) && car.isChange) {
                        car.setOutTime(time);
                        break;
                    }
                }
            }
        }

        // 총 시간 계산하며 넣기
        Map<String, Integer> map = new HashMap<>();
        for (Car car : cars) {
            int total = getTotalTime(car.in, car.out);
            if (map.containsKey(car.number))
                map.put(car.number, map.get(car.number) + total);
            else map.put(car.number, total);
        }
        int i = 0;
        String[] keySort = new String[map.size()];
        for (String key : map.keySet())
            keySort[i++] = key;
        Arrays.sort(keySort);
        i = 0;
        int[] answer = new int[map.size()];
        for (String key : keySort)
            answer[i++] = getFee(map.get(key), fees);
        return answer;
    }

    public static int getFee(int times, int[] fees) {
        // fees.length() == 4
        // [0] = 기본 시간 / [1] = 기본 요금 / [2] = 단위 시간 / [3] = 단위 요금
        if (times <= fees[0])
            return fees[1];

        int result = fees[1];
        times -= fees[0];

        int reap = times/fees[2];
        result += reap * fees[3];

        if (times - (reap * fees[2]) > 0)
            result += fees[3];

        return result;

    }

    public static int getTotalTime(String inTime, String outTime) {
        int inTimes = 0, outTimes = 0;
        StringTokenizer st = new StringTokenizer(inTime, ":");
        inTimes += Integer.parseInt(st.nextToken()) * 60;
        inTimes += Integer.parseInt(st.nextToken());

        st = new StringTokenizer(outTime, ":");
        outTimes += Integer.parseInt(st.nextToken()) * 60;
        outTimes += Integer.parseInt(st.nextToken());

        int result = outTimes - inTimes;
        return result;
    }

    public static class Car{
        String number; // 차번호
        String in; // 입차 시간
        String out; // 출차 시간
        boolean isChange; // 출차 변경 가능 여부

        public Car(String number, String time) {
            // IN만 받음
            this.number = number;
            this.in = time;
            this.out = "23:59";
            this.isChange = true;
        }

        public void setOutTime(String time) {
            this.out = time;
            this.isChange = false;
        }
    }
}

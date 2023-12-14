/**
 * 1. 문제정보
 *  - 제목 : 혼자서 하는 틱택토
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/160585
 *  2. 풀이핵심
 *  - 3X3으로 고정된 MAP에 대해 맞는 경우와 안 맞는 경우를 확인하기
 * 3. 풀이후기
 *  - MAP이 다 가득찬 경우에 더이상 진행할 수 없으니 0으로 고정했다가 오랜 실패를 했다.
 */
class Solution {
    public int N = 3;
    public char[][] MAP = new char[N][N];
    public int solution(String[] board) {
        // init
        int countO = 0, countX = 0;
        
        // setting
        for (int n = 0;n < N;n++)
            for (int m = 0;m < N;m++) {
                MAP[n][m] = board[n].charAt(m);
                if (MAP[n][m] == 'O') countO++;
                else if (MAP[n][m] == 'X') countX++;
            }
        
        if (countO < countX) return 0; // X가 더 많을 수는 없음
        if (!(countO - countX == 0 || countO - countX == 1)) return 0; // 2개이상 차이가 날 수 없음
        
        boolean correctO = isExistCorrectRow('O') || isExistCorrectCol('O') || isExistCorrectDire('O');
        boolean correctX = isExistCorrectRow('X') || isExistCorrectCol('X') || isExistCorrectDire('X');
        
        if (correctO && !(countO == countX + 1)) return 0;  // O로 이겼다면, O가 X보다 1개 많음
        if (correctX && !(countO == countX)) return 0;      // X로 이겼다면, O가 X랑 같음
        if (correctO && correctX) return 0;                 // 둘다 동시에 이길 수 없음
        
        return 1;
    }
    
    public boolean isExistCorrectRow(char basic) {
        boolean result = false;
        
        for (int n = 0;n < N;n++) {
            char ch = MAP[n][0];
            if (MAP[n][0] != basic) continue;
            boolean isCorrect = true;
            
            for (int m = 0;m < N;m++)
                isCorrect = isCorrect && ch == MAP[n][m];
            
            result = result || isCorrect;
        }
        
        return result;
    }    
    
    public boolean isExistCorrectCol(char basic) {
        boolean result = false;
        
        for (int n = 0;n < N;n++) {
            char ch = MAP[0][n];
            if (MAP[0][n] != basic) continue;
            boolean isCorrect = true;
            
            for (int m = 0;m < N;m++)
                isCorrect = isCorrect && ch == MAP[m][n];
            
            result = result || isCorrect;
        }
        
        return result;
    }
    
    public boolean isExistCorrectDire(char basic) {
        if (MAP[0][0] == MAP[1][1] && MAP[1][1] == MAP[2][2] && MAP[1][1] == basic) return true;
        if (MAP[0][2] == MAP[1][1] && MAP[1][1] == MAP[2][0] && MAP[1][1] == basic) return true;
        return false;
    }
}
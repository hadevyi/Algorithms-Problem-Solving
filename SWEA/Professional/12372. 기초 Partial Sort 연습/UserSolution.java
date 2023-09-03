public class UserSolution {

    public int SIZE, MAX_SIZE = 100000;
    public Data[] HEAP;

    /**
     * 각 테스트케이스 처음에 호출되는 초기화 함수이다.
     * */
    public void init() {
        SIZE = 0;
        HEAP = new Data[MAX_SIZE];
    }

    /**
     * user을 추가하는 함수이다.
     * @param uID: user id, 0부터 시작해서 순차적으로 증가한다 (0 ≤ uID < 100000)
     * @param income: user의 수입, 클수록 우선순위가 높다.
     *                만약 수입이 동일한 경우 uID가 작은 user의 우선순위가 높다.
     * */
    public void addUser(int uID, int income) {
        HEAP[SIZE++] = new Data(uID, income);

        if (SIZE <= 1) return;

        int myIdx = SIZE - 1;
        while (isSwapParent(myIdx)) {
            doSwapParent(myIdx);
            myIdx = (myIdx - 1) / 2;
        }
    }

    public boolean isSwapParent(int myIdx) {
        int parentIdx = (myIdx - 1) / 2;
        if (HEAP[parentIdx].income < HEAP[myIdx].income) return true;

        if (HEAP[parentIdx].income == HEAP[myIdx].income)
            return HEAP[myIdx].id < HEAP[parentIdx].id;

        return false;
    }

    public void doSwapParent(int myIdx) {
        int parentIdx = (myIdx - 1) / 2;
        Data temp = HEAP[myIdx];
        HEAP[myIdx] = HEAP[parentIdx];
        HEAP[parentIdx] = temp;
    }

    /**
     * 수입이 가장 큰 user 10명의 uID를 수입에 대해 내림차순으로 구하는 함수이다.
     * 총 user의 수가 10명이 되지 않으면 존재하는 user의 uID를 수입에 대해 내림차순으로 구한다.
     * @param result: 수입이 큰 순서대로 10개의 uID를 저장한다. (1 ≤ result 개수 ≤ 10)
     * @return result의 개수를 반환한다.
     * */
    int getTop10(int[] result) {

        Data[] deleteDatas = new Data[10];
        int ANS = 0;
        for (int idx = 0;idx < 10 && SIZE > 0;idx++) {
            Data root = HEAP[0];
            result[idx] = root.id;
            deleteDatas[ANS] = root;

            int myIdx = 0;
            HEAP[0] = HEAP[SIZE-- - 1];
            ANS++;

            while (true) {
                int swapIdx = getChildIdx(myIdx);
                if (swapIdx == -1) break;
                doSwapChild(myIdx, swapIdx);
                myIdx = swapIdx;
            }
        }

        for (int i = 0;i < ANS;i++)
            addUser(deleteDatas[i].id, deleteDatas[i].income);
        return ANS;
    }

    int getChildIdx(int myIdx) {
        int leftChileIdx = myIdx * 2 + 1;
        int rightChildIdx = myIdx * 2 + 2;

        if (leftChileIdx >= SIZE) return -1; // 자식이 하나도 없는 경우

        int checkIdx = -1;
        Data checkChild = null;

        if (rightChildIdx >= SIZE) {
            checkIdx = leftChileIdx;
            checkChild = HEAP[leftChileIdx];
        } else {
            if (HEAP[leftChileIdx].income == HEAP[rightChildIdx].income) {
                if (HEAP[leftChileIdx].id < HEAP[rightChildIdx].id) {
                    checkChild = HEAP[leftChileIdx];
                    checkIdx = leftChileIdx;
                } else {
                    checkChild = HEAP[rightChildIdx];
                    checkIdx = rightChildIdx;
                }
            } else if (HEAP[leftChileIdx].income < HEAP[rightChildIdx].income) {
                checkChild = HEAP[rightChildIdx];
                checkIdx = rightChildIdx;
            } else {
                checkChild = HEAP[leftChileIdx];
                checkIdx = leftChileIdx;
            }
        }

        if (HEAP[myIdx].income < checkChild.income) return checkIdx;
        else if (HEAP[myIdx].income == checkChild.income) {
            if (HEAP[myIdx].id > checkChild.id) return checkIdx;
        }

        return -1;
    }

    void doSwapChild(int myIdx, int childIdx) {
        Data temp = HEAP[myIdx];
        HEAP[myIdx] = HEAP[childIdx];
        HEAP[childIdx] = temp;
    }
}
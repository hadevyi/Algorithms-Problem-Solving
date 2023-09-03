public class UserSolution {
    private final static int MAX_NODE = 10000;

    private Node[] node = new Node[MAX_NODE];
    private int nodeCnt = 0;
    private Node head;

    public Node getNode(int data) {
        node[nodeCnt] = new Node(data);
        return node[nodeCnt++];
    }

    // 초기화
    public void init() {
        head = getNode(0);
        head.next = null;
        nodeCnt = 0;
    }

    // 맨 앞에 노드 추가
    public void addNode2Head(int data) {
        Node newNode = getNode(data);
        newNode.next = head.next;
        head.next = newNode;
    }

    // 맨 뒤에 노드 추가
    public void addNode2Tail(int data) {
        Node newNode = getNode(data);
        Node checkNode = head;

        while (checkNode.next != null) {
            checkNode = checkNode.next;
        }

        checkNode.next = newNode;
    }

    // 지정된 순서(num)에 노드 추가 (1 - 2 - 3 - 4 - 5 - ... )
    public void addNode2Num(int data, int num) {
        int count = 0;
        Node newNode = getNode(data);
        Node checkNode = head;

        while (checkNode.next != null) {
            if (++count == num) {
                break;
            }
            checkNode = checkNode.next;
        }

        newNode.next = checkNode.next;
        checkNode.next = newNode;
    }

    // 주어진 data 값을 가진 노드 삭제
    public void removeNode(int data) {
        Node checkNode = head;

        while (checkNode.next != null) {
            if (checkNode.next.data != data) {
                checkNode = checkNode.next;
            } else {
                checkNode.next = checkNode.next.next;
                nodeCnt--;
            }
        }
    }

    // output[] 배열에 리스트 노드의 data를 차례로 넣고, 총 노드 갯수를 리턴
    public int getList(int[] output) {
        Node checkNode = head.next;
        int count = 0;
        for (int i = 0;i < nodeCnt;i++) {
            count++;
            output[i] = checkNode.data;
            checkNode = checkNode.next;
        }
        return count;
    }
}

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
        head = getNode(-1); // dummy
        nodeCnt = 0;
    }

    // 맨 앞에 노드 추가
    public void addNode2Head(int data) {
        Node newNode = getNode(data);
        newNode.next = head.next;
        if (head.next != null) {
            newNode.prev = head;
            newNode.next.prev = newNode;
        }
        head.next = newNode;
    }

    // 맨 뒤에 노드 추가
    public void addNode2Tail(int data) {
        Node checkNode = head;
        while (checkNode.next != null)
            checkNode = checkNode.next;

        Node newNode = getNode(data);
        checkNode.next = newNode;
        newNode.prev = checkNode;
    }

    // 지정된 순서(num)에 노드 추가 (1 - 2 - 3 - 4 - ...)
    public void addNode2Num(int data, int num) {
        if (num == 1) { addNode2Head(data); return; }
        if (num > nodeCnt) { addNode2Tail(data); return; }

        Node newNode = getNode(data);
        Node findNode = head;
        int count = 0;

        while (findNode.next != null) {
            if (count + 1 == num) {
                break;
            }
            findNode = findNode.next;
            count++;
        }

        newNode.next = findNode.next;
        newNode.prev = findNode;
        findNode.next.prev = newNode;
        findNode.next = newNode;
    }

    // data를 가진 node의 순서를 리턴
    public int findNode(int data) {
        Node findNode = head;
        int count = 0;

        while (findNode != null) {
            if (findNode.data == data) break;
            findNode = findNode.next;
            count++;
        }
        return count;
    }

    // data를 가진 노드를 삭제
    public void removeNode(int data) {
        Node findNode = head.next;

        while (findNode != null) {
            if (findNode.data == data) {
                if (findNode.next != null)
                    findNode.next.prev = findNode.prev;
                findNode.prev.next = findNode.next;
                nodeCnt--;
            }
            findNode = findNode.next;
        }

    }

    // 노드의 data 정보를 차례대로 output[]에 저장하고 노드 갯수를 리턴
    public int getList(int[] output) {
        Node checkNode = head;
        int idx = 0;
        while (checkNode.next != null) {
            output[idx++] = checkNode.next.data;
            checkNode = checkNode.next;
        }
        return nodeCnt;
    }

    // 노드의 data 정보를 역순으로 output[]에 저장하고 노드 갯수를 리턴
    public int getReversedList(int[] output) {
        Node checkNode = head;
        while (checkNode.next != null)
            checkNode = checkNode.next;

        int idx = 0;
        while (checkNode.prev != null) {
            output[idx++] = checkNode.data;
            checkNode = checkNode.prev;
        }
        return nodeCnt;
    }
}
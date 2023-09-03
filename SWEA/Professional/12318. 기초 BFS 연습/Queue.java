public class Queue {
    public int MAX_SIZE = 100;
    public int front, end, size;
    public Node[] nodes;

    public Queue() {
        this.front = 0;
        this.end = 0;
        this.size = 0;
        this.nodes = new Node[MAX_SIZE];
    }

    public void enqueue(Node node) {
        if (this.size == MAX_SIZE) return;
        this.size++;
        this.nodes[this.end++] = node;
    }

    public Node dequeue() {
        if (this.size == 0) return null;
        this.size--;
        Node now = nodes[this.front++];
        return now;
    }
}
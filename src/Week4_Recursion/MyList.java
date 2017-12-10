package Week4_Recursion;

public class MyList {
    Node head;
    Node tail;
    int length;

    public MyList(int value) { //create a list contains 1 node
        head = new Node(value);
        tail = head;
        length = 1;
    }

    public void appendNode(Node aNode) { //append a node
        tail.next = aNode;			//into the list
        aNode.prev = tail;
        tail = tail.next;
        length += 1;		 //keep track of size
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next; //traverse the list
        }
    }

    public void insert(int i, int data) {
        Node u = new Node(data);
        Node w = getNode(i);
        u.prev = w.prev;
        u.next = w;
        u.next.prev = u;
        u.prev.next = u;
        length ++;
    }

    public void remove(int i) {  // assume i >= 0
        Node w = getNode(i);
        w.prev.next = w.next;
        w.next.prev = w.prev;
        length--;
    }

    public Node getNode(int i) {
        Node p = head;
        for (int j = 0; j < i; j++)
            if (p != null) p = p.next;
        return p;
    }

    public Node addAfter(Node w, int data) {
        Node u = new Node(0);
        u.data = data;
        u.next = w.next;
        w.next = u;
        length++;
        return u;
    }

}

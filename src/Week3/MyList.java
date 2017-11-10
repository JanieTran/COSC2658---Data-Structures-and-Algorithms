package Week3;

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

    public void remove(int i) {  // assume i >= 0
        if (i == 0) {
            head = head.next;
        } else if (i > 0) {
            Node prev = getNode(i - 1);
            Node cur = prev.next;
            prev.next = cur.next;
        }
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

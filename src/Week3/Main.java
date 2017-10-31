package Week3;

public class Main {
    public static void main(String[] args) {
        MyList ml = new MyList(1);

        ml.appendNode(new Node(19));
        ml.appendNode(new Node(98));

        ml.printList();
    }
}

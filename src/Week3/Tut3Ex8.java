// Write a method intersect that accepts two sorted arrays of integers as parameters
// and returns a new linked list that contains only the elements that are found in both arrays.

package Week3;

public class Tut3Ex8 {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5,6,10};
        int[] list2 = {2,4,6,8,10,11};

        MyList commonList = intersect(list1, list2);
        commonList.printList();
    }

    public static MyList intersect(int[] list1, int[] list2) {
        MyList common = new MyList(0);

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]) {
                    common.appendNode(new Node(list1[i]));
                    break;
                }
            }
        }

        common.remove(0);

        return common;
    }
}

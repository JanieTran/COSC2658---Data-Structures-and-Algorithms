// Tower of Hanoi
// Reference: http://www.javainterviewpoint.com/tower-hanoi-java-recursion/

package Week4_Recursion;

public class Tut4Ex11 {
    public static void main(String[] args) {
        towerOfHanoi(3, 1, 2, 3);
    }

    private static void towerOfHanoi(int numbersOfDisks, int start, int mid, int end) {
        // Base case
        if (numbersOfDisks == 0) {
            return;
        }

        // Shifting
        towerOfHanoi(numbersOfDisks - 1, start, end, mid);
        System.out.println("Move disk " + numbersOfDisks + " from pole " + start + " to " + end);
        towerOfHanoi(numbersOfDisks - 1, mid, start, end);
    }
}

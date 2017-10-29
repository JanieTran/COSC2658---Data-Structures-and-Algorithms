// Write a program to display the characters corresponding to ASCII codes
// ranging from 0 to 127 onto the console

package Tutorial2;

public class Tut2Ex6 {
    public static void main(String[] args) {
        System.out.println("ASCII code\t\tCharacter");
        for(int i = 0; i <= 127; i++) {
            System.out.println("\t" + i + "\t\t\t\t" + (char)i);
        }
    }
}

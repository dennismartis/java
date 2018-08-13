
/**
 * CharSwitchExercise
 */
import java.util.Scanner;

public class CharSwitchExercise {
    public static void main(String[] args) {
        char switchKey = '5';
        switch (switchKey) {
        case (char) 'A':
            System.out.println("A = Alpha");
            break;
        case 'B':
            System.out.println("B =Bravo");
            break;
        case 'C':
            System.out.println("C = Charlie");
            break;
        case 'D':
            System.out.println("D = Delta");
            break;
        case 'E':
            System.out.println("E = Echo");
            break;

        default:
            System.out.println("Not found.");
            break;
        }
    }

}
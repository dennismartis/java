import java.util.Scanner;

public class MethodOverloading {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Reading from System.in
        System.out.println("Enter a number of feet: ");
        int feet = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Enter a number of inches: ");
        int inches = reader.nextInt(); // Scans the next token of the input as an int.
        // once finished
        reader.close();

        double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        System.out.println(feet +" feet and " + inches + " inches equals " + centimeters +" centimeters");
        // System.out.println(calcFeetAndInchesToCentimeters(inches));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            double centimeters = inches * 2.54 + (feet * 12 * 2.54);
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        } else {
            int feet = (int) inches / 12;
            int remainingInches = inches % 12;
            double centimeters = calcFeetAndInchesToCentimeters(feet, remainingInches);
            return centimeters;
        }
    }
}
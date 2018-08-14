public class CalculateInterest {

    public static void main(String[] args) {
        for (int i=2; i<=8; i++) {
            System.out.println("The interest of 10000 with an interest rate of " + i + "% = " + String.format("%.2f",calcInterest(10000, i)));
        }
        System.out.println();
        for (int i=8; i>=2; i--) {
            System.out.println("The interest of 10000 with an interest rate of " + i + "% = " + String.format("%.2f",calcInterest(10000, i)));
        }
    }

    public static double calcInterest(double amount,double interestRate) {
        return (amount * (interestRate / 100));
    }
}
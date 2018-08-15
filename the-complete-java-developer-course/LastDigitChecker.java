public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(35, 723, 37));
    }

    public static boolean hasSameLastDigit(int numA, int numB, int numC) {
        if (numA < 10 || numA > 1000 || 
            numB < 10 || numB > 1000 || 
            numC < 10 || numC > 1000) {
            return false;
        }
        int digitA = numA % 10;
        int digitB = numB % 10;
        int digitC = numC % 10;
        if (digitA == digitB || digitA == digitC || digitB == digitC) {
            return true;
        }
        return false;
    }
}
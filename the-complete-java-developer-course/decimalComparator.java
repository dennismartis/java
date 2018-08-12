public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber,double secondNumber) {
        double firstNumberMultiplied = firstNumber * 1000;
        double secondNumberMultiplied = secondNumber * 1000;
        if ((int) firstNumberMultiplied == (int) secondNumberMultiplied) {
            return true;
        } else {
            return false;
        }
    }
}
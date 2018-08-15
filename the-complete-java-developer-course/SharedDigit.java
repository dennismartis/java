public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(72, 18));
    }

    public static boolean hasSharedDigit(int numberA,int numberB) {
        if (numberA < 10 || numberA > 99 || numberB < 10 || numberB > 99) {
            return false;
        }
        int lastDigitA = numberA % 10;
        int firstDigitA = numberA / 10;
        int lastDigitB = numberB % 10;
        int firstDigitB = numberB / 10;
        if (firstDigitA == firstDigitB || 
            firstDigitA == lastDigitB || 
            lastDigitA == firstDigitB || 
            lastDigitA == lastDigitB) {
                return true;
            }
        return false;

    }
}
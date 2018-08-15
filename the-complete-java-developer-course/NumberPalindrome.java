public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = 0 - number;
        }
        int reverse = 0;
        int originalNumber = number;
        while (number > 0) {
            reverse *= 10;
            int digit = number % 10;
            reverse += digit;
            number /= 10;
        }
        if (originalNumber == reverse) {
            return true;
        }
        return false;
    }

}
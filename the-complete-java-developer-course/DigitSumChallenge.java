/**
 * DigitSumChallenge
 */
public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1251341325743576547L));
    }

    public static long sumOfDigits(Long number) {
        long sum = 0;
        if (number < 10) {
            return -1;
        } 
        while (number > 0) {
            long digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
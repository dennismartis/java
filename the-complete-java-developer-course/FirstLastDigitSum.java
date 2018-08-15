public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstLastDigit(14753));

    }

    public static int sumFirstLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        if (number < 10) {
            return number * 2;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            firstDigit = number;
            number /= 10;           
        }
        return firstDigit + lastDigit;
    }
    
}
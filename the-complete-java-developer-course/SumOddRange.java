public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(isOdd(10));
        System.out.println(sumOdd(1, 11));
    }

    public static boolean isOdd(int number) {
        if (number % 2 == 0 || number < 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start,int end) {
        int sum = 0;
        if (start < 0 || end < 0 || end < start) {
            
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
        }
        return sum;
    }

}
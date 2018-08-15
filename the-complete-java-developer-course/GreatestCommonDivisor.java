public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1010, 10));
    }

    public static int getGreatestCommonDivisor(int first,int second) {
        if (first < 10 || second < 10 ) {
            return -1;
        }
        int match = -1;
        if (first < second) {
            for (int i = 1; i <= first; i++) {
                if (first % i == 0 && second % i == 0) {
                    match = i;
                }
            }
        }
        if (first > second) {
            for (int i = 1; i < second; i++) {
                if (first % i == 0 && second % i == 0) {
                    match = i;
                }
            }
        }
        return match;
    }
}
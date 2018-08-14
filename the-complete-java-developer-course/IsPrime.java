/**
 * IsPrime
 */
public class IsPrime {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 2; i < 1000; i++) {
            if (isAPrime(i)) {
                System.out.println(i);
                count++;
                }
            // if (count >= 10) {
            //     break;
            // }
        }
        
    }
    public static boolean isAPrime(int n) {
        
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n/2; i++) {
            if (n % i == 0)
            return false;
        }

        return true;
    }
}
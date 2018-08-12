public class TeenNumberChecker {
    public static boolean hasTeen(int val1,int val2,int val3) {
        if (val1 >= 13 && val1 < 20) {
            return true;
        } else if (val2 > 12 && val2 < 20) {
            return true;
        } else if (val3 > 12 && val3 < 20) {
            return true;
        } else {
            return false;
        }
    }
}
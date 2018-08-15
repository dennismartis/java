public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(3280);
    }
    
    public static void printFactors(int number) {
        String result = "";
        if (number < 0) {
            result = "Invalid Value";
        } else {
            for (int i=1; i <=number; i++) {
                if (number % i == 0) {
                    result += (i + " ");
                }
            }
        }
        System.out.println(result);
    }
}
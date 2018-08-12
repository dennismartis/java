/**
 * MinutesToYearsAndDaysCalculator
 */
public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDay(561600);
    }

    public static void printYearsAndDay(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            double days = minutes / 60 / 24;
            double years = days / 365;
            double remainingDays = days % 365;
            System.out.println(minutes + " min = " + (int) years + " y and " + (int) remainingDays + "d" );
        }
    }
}
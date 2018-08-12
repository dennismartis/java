/**
 * SecondsAnsMinutesChallenge
 */
public class SecondsAnsMinutesChallenge {

    public static void main(String[] args) {
        getDurationString(3452, 3);
        getDurationString(432553);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 60) {
            String returnValue = "Invalid Value";
            System.out.println(returnValue);
            return returnValue;
        } else {
            int hours = minutes / 60;
            int remaining_minutes = minutes % 60;
            String returnString = numberFormatter(hours) + "h " + numberFormatter(remaining_minutes) + "m " + numberFormatter(seconds) + "s";
            System.out.println(returnString);
            return returnString;
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            String returnValue = "Invalid Value";
            System.out.println(returnValue);
            return returnValue;
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            String returnString = getDurationString(minutes, remainingSeconds);
            // System.out.println(returnString);
            return returnString;
        }
    }
    public static String numberFormatter(int number) {
            String formattedNumber = String.valueOf(number);
            if (number < 10) {
                formattedNumber = "0" + number;
            }
            return formattedNumber;
        
    }
}
package academy.learnprogramming;

public class SecondsAndMinutes {

    public static String getDurationString(long minutes, long seconds) {

        if (minutes < 0 || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        } else {
            long hour = minutes / 60;
            long remainingMinutes = minutes % 60;

            return hour + "h " + remainingMinutes + "m " + seconds + "s";
        }
    }
}

/**
 * Created by Gabor on 21/03/2017.
 */
public class SecondsInADay {

    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int totalDaySeconds = 24 * 60 * 60;
        int pastSeconds = currentSeconds + currentMinutes * 60 + currentHours * 3600;
        int remainingSeconds = totalDaySeconds - pastSeconds;

        System.out.println("Remaining seconds today: " + remainingSeconds);
    }

}

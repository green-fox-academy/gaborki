/**
 * Created by Gabor on 21/03/2017.
 */
public class CodingHours {
    public static void main(String[] args) {

        int dailyHours = 6;
        int weeks = 17;
        int workDays = 5;
        int workHours = 52;
        int totalHours = dailyHours * weeks * workDays;
        double percentage = totalHours * 100 / (workHours * weeks);


        System.out.println("Total coding hours in a semester per attendee: " + totalHours);
        System.out.println("Percentage of coding hours in a semester per attendee: " + percentage + "%");
    }


        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
    }

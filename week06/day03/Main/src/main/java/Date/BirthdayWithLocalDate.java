package Date;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

  public class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {

    @Override
    public LocalDate parseDate(String str) {
      LocalDate parsedDate;
      parsedDate = LocalDate.parse(str);
      return parsedDate;
      // TODO - return with the parsed date; format is: yyyy-MM-dd
    }

    @Override
    public String printMonthAndDay(LocalDate date) {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM. dd.");
      String mAndD = date.format(formatter);
      return mAndD;

      // TODO - return the date formatted: month & day (MM. dd.)
    }

    @Override
    public boolean isAnniversaryToday(LocalDate date) {
      if (date == null){
        throw new NullPointerException();
      }
        LocalDate today = LocalDate.now();
        if (today == date) {
          return true;
        } else {
          return false;
        }
      // TODO - return with true if today is the same month+day as date
    }

    @Override
    public int calculateAgeInYears(LocalDate birthday) {
      LocalDate today = LocalDate.now();
      Period age = Period.between(today, birthday);
      return age.getYears();
      // TODO - return how many years age the input date 'birthday' was
    }

    @Override
    public int calculateDaysToNextAnniversary(LocalDate date) {
      LocalDate today = LocalDate.now();
      LocalDate tempDate = LocalDate.of(today.getYear(), date.getMonth(), date.getDayOfMonth());
      int result = (int)ChronoUnit.DAYS.between(today, tempDate);
      if (result < 0) {
        LocalDate nextBDay = LocalDate
            .of(today.getYear() + 1, date.getMonth(), date.getDayOfMonth());
        result = (int) ChronoUnit.DAYS.between(today, nextBDay);
      }
//      if (date.isLeapYear()) {
//        result += 1;
//      }
      return result;
    }
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)

    public static void main(String[] args) {
      new BirthdayWithLocalDate().run();
    }

    private void run() {

      print("Birthday with java.util.Date.");
      String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

      LocalDate birthdayDate = parseDate(birthdayStr);
      print("Your birthday: " + printMonthAndDay(birthdayDate));

      if (isAnniversaryToday(birthdayDate)) {
        int ageInYears = calculateAgeInYears(birthdayDate);
        print("Congratulations! Today is your " + ageInYears + "th birthday!");
      } else {
        int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
        print("You have to wait only " + daysLeft + " days for your next birthday.");
      }
    }

    private void print(String line) {
      System.out.println(line);
    }

    private String readInput(String message) {
      System.out.print(message + ": ");
      return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");
  }


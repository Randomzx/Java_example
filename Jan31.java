import java.time.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Jan31 {

    public static void main(String args[]) {

        LocalDate date = LocalDate.of(2057, 8, 11);
        LocalTime time = LocalTime.of(14, 30, 15);


        // number of letters doesn't change the number of digits
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("y");
        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("YYYY");
        // Year, Month of the Year, Day of the Year
        DateTimeFormatter d3 = DateTimeFormatter.ofPattern("Y M D");
        // Day of the Week
        DateTimeFormatter d4 = DateTimeFormatter.ofPattern("e");
        // Hour of day, clock hour, minute of hour, second of minute
        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H h m s");
        // Hour of day, minute of hour, am/pm
        DateTimeFormatter t2 = DateTimeFormatter.ofPattern("'Time now:'HH mm a");

        System.out.println(d1.format(date));
        System.out.println(d2.format(date));
        System.out.println(d3.format(date));
        System.out.println(d4.format(date));
        System.out.println(t1.format(time));
        System.out.println(t2.format(time));

        System.out.println("---");

        // The LocalTime class defines the atDate() method to combine a LocalDate with itself to create LocalDateTime
        LocalTime time02 = LocalTime.of(14, 10, 0);
        LocalDate date02 = LocalDate.of(2016,02,28);
        LocalDateTime dateTime = time.atDate(date02);
        ZonedDateTime zdt = ZonedDateTime.now();

        System.out.println(dateTime);

        DateTimeFormatter formatter1 =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter formatter2 =
                DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter formatter3 =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter formatter4 =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,
                        FormatStyle.SHORT);

        System.out.println("Medium format:");
        System.out.println(formatter1.format(zdt));
        System.out.println("Full format:");
        System.out.println(formatter2.format(zdt));
        System.out.println("Long format:");
        System.out.println(formatter3.format(zdt));
        System.out.println("Short format:");
        System.out.println(formatter4.format(zdt));

        System.out.println("---");


        // N represent a number
        //  P = Parse, Y = Year, M = Month, D = day, W = Week
        // String must start with p or P and at least one of the above
        // if (-) precedes the string value, it is applied to all values
        // if (-) precedes individual numbers, it applies only to that section
        // For the string format PnW, the count of weeks is multiplied by 7 to get the number of days.
        Period p5Yrs1 = Period.parse("P5y");
        Period p5Yrs2 = Period.parse("p5y");
        Period p5Yrs3 = Period.parse("P5Y");
        Period p5Yrs4 = Period.parse("+P5Y");
        Period p5Yrs5 = Period.parse("P+5Y");
        Period p5Yrs6 = Period.parse("-P-5Y");
        Period p5Yrs7 = Period.parse("P5y1m2d");
        Period p5Yrs8 = Period.parse("p9m");
        Period p5Yrs9 = Period.parse("P60d");
        Period p5Yrs10 = Period.parse("-P5W");

        System.out.println(p5Yrs1 + ":" + p5Yrs2);
        System.out.println(p5Yrs2);
        System.out.println(p5Yrs3);
        System.out.println(p5Yrs4);
        System.out.println(p5Yrs5);
        System.out.println(p5Yrs6);
        System.out.println(p5Yrs7);
        System.out.println(p5Yrs8);
        System.out.println(p5Yrs9);
        System.out.println(p5Yrs10);

















    }
}

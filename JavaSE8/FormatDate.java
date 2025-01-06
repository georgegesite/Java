import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * FormatDate
 */
public class FormatDate {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2020-01-20
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); // 11:12:34
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2020-01-20T11:12:34

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
        System.out.println(shortDateTime.format(date)); // 1/20/20
        // System.out.println(shortDateTime.format(time)); //
        // UnsupportedTemporalTypeException - time cannot be formatted
        // as a date

        // Equivalent to below || Can be interchangeable

        System.out.println(dateTime.format(shortDateTime));
        System.out.println(date.format(shortDateTime));
        // System.out.println(time.format(shortDateTime)); //
        // UnsupportedTemporalTypeException - time cannot be formatted
        // as

    }
}
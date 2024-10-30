import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Dates
 */
public class Dates {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        System.out.println(LocalDate.of(2024, Month.JANUARY, 20));
        System.out.println(date);
        System.out.println(LocalDate.of(2024, 1, 20));

        Period period = Period.ofMonths(1);

        System.out.println(period);
    }
}
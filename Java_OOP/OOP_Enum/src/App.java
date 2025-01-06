import java.time.DayOfWeek;

public class App {
    public static void main(String[] args) throws Exception {
        DayOfWeek today = DayOfWeek.FRIDAY;

        // Switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("It's a workday.");
                break;
            case WEDNESDAY:
                System.out.println("It's midweek!");
                break;
            case FRIDAY:
                System.out.println("It's Friday, time to relax.");
                break;
            default:
                System.out.println("It's some other day.");
        }

        // Looping through enum values
        System.out.println("Days of the week:");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}

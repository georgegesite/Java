/**
 * SwitchStatements
 */
public class SwitchStatements {

    public static void main(String[] args) {

        int dayOfWeek = 0;
        switch (dayOfWeek) {// cases with no break statements will be executed, if first case is true
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
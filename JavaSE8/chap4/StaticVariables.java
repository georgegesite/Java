
import java.util.ArrayList;

/**
 * StaticVariables
 */
public class StaticVariables {
    private static final int NUM_BUCKETS = 45;
    private static final ArrayList<String> values = new ArrayList<>();

    public static void main(String[] args) {
        values.add("changed");
        values.add("another change");

        System.out.println(values);
    }
}
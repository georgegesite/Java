import java.util.HashMap;
import java.util.Map;
public class Maps {
    public static void main (String []  args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "George");
        map.put(2, "Flora");
        map.put(3, "Mae");

        System.out.println(map);
            map.remove(1);
         System.out.println(map);

    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestApp {
    public static void duplicateNombers(List<Integer> integer) {
        System.out.println(integer.toString());
        Map<Integer, Integer> store = new HashMap<Integer, Integer>();
        if (!integer.isEmpty()) {
            for (Integer temp : integer) {
                Integer count = store.get(temp);
                store.put(temp, (count == null) ? 1 : count + 1);
            }
        }
        for (Map.Entry<Integer, Integer> val : store.entrySet()) {
            System.out.println(val.getKey() +" : "+ val.getValue() );
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 5, 5, 6, 6, 3, 3, 3, 8, 9, 9, 9, 9, 1, 2, 3);
        duplicateNombers(list);
    }
}

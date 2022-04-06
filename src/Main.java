import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> intListFiltered1 = new ArrayList<>();
        List<Integer> intListFiltered2 = new ArrayList<>();

        for (int i :
                intList) {
            if (i > 0) {
                intListFiltered1.add(i);
            }
        }

        for (int i :
                intListFiltered1) {
            if (i % 2 == 0) {
                intListFiltered2.add(i);
            }
        }

        intListFiltered2.sort((a, b) -> a.compareTo(b));

        for (int i:
             intListFiltered2) {
            System.out.println(i);
        }
    }
}

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();

        for (int i : numbers) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if (x > 0 && x % 2 == 0) {
                newList.add(x);
            }
        }

        newList.sort(Comparator.naturalOrder());

        System.out.println(newList);

    }
}
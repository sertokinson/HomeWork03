import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nat = new ArrayList<>();
        int n = scanner.nextInt();
        int type, x;
        Integer min;
        for (int i = 0; i < n; i++) {
            type = scanner.nextInt();
            if (type == 1) {
                x = scanner.nextInt();
                nat.add(x);
            } else {
                min = nat.get(0);
                for (Integer integer : nat) {
                    if (min > integer)
                        min = integer;
                }
                nat.remove(min);
                System.out.println(min);
            }
        }
    }
}


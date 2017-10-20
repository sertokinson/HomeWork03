import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task5{
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator iterator= new ReverceIterable(list).iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}

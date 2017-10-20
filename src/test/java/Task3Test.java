import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class Task3Test extends Assert {
    @Test
    public void test() throws IOException {
        File f = new File("C:\\JavaSchool\\Homeworks\\HomeWork_03\\newVersion\\collections\\text.txt");
        Map<String,Integer> m=Task3.countString(f);
        Iterator<Integer> it=m.values().iterator();
        int digit=m.get("sd");
        assertEquals(digit,2);
        for (String s:m.keySet()) {
            System.out.println(s+" "+it.next());
        }
    }

}
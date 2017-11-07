import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Task2Test extends Assert {
    @Test
    public void test() throws IOException {
        assertArrayEquals(Task2.differentString(
                new File("C:\\JavaSchool\\Homeworks\\HomeWork_03\\newVersion\\collections\\text.txt")).toArray(),
                new String[]{"m", "Aa", "df", "sd", "efr", "fdg", "sdf", "rmjd", "sdas", "sdasd"});
    }

}
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Task4Test extends Assert {
    @Test
    public void test() throws IOException {
        Assert.assertArrayEquals(Task4.reverceLine(
                new File("C:\\JavaSchool\\Homeworks\\HomeWork_03\\newVersion\\collections\\text.txt")).toArray(),
                new String[]{"df343efr2df", "", "df3fdg", "sdasd2Aa3sd412rmjd", "sdf4sd5,.,m.sdas5"});
    }

}
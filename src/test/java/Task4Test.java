import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Task4Test extends Assert {
    @Test
    public void test() throws IOException {
        File f = new File("C:\\JavaSchool\\Homeworks\\HomeWork_03\\newVersion\\collections\\text.txt");
        String[] strings = new String[]{
                "df343efr",
                "",
                "df3fdg",
                "sdasd23sd412rmjd",
                "sdf4sd5,.,m.sdas5"
        };
        int i = 0;
        for (String s : Task4.reverceLine(f)) {
            assertEquals(s, strings[i++]);
        }
    }

}
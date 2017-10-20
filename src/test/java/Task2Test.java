import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Task2Test extends Assert {
    @Test
    public void test() throws IOException {
        File f = new File("C:\\JavaSchool\\Homeworks\\HomeWork_03\\newVersion\\collections\\text.txt");
        String[]strings=new String[]{
                "m",
                "Aa",
                "df",
                "sd",
                "efr",
                "fdg",
                "sdf",
                "rmjd",
                "sdas",
                "sdasd"
        };
        int i=0;
        for (String s:Task2.differentString(f))
            assertEquals(s,strings[i++]);
    }

}
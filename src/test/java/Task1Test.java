import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Task1Test extends Assert {
    @Test
    public void test() throws IOException {
        File f = new File("C:\\JavaSchool\\Homeworks\\HomeWork_03\\newVersion\\collections\\text.txt");
        assertEquals(Task1.differentCountString(f),10);
    }

}
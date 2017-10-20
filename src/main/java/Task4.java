import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static Collection<String> reverceLine(File f) throws IOException {
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        Deque<String> strings=new ArrayDeque<>();
        while ((line = fin.readLine()) != null)
                strings.addFirst(line);
        return strings;
    }
}



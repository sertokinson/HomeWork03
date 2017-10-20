import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static int differentCountString(File f) throws IOException {
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        Set<String> strings = new HashSet<>();
        Matcher m;
        while ((line = fin.readLine()) != null) {
            m = Pattern.compile("[A-z]").matcher(line);
            while (m.find())
                strings.add(line.substring(m.start(), m.end()));
        }
        return strings.size();
    }
}










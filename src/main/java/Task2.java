import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static Collection<String> differentString(File f) throws IOException {
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        Set<String> strings = new TreeSet<>((a, b) -> {
            if (a.length()==b.length())
                return a.compareTo(b);
            else
                return a.length()-b.length();
        });
        while ((line = fin.readLine()) != null) {
            Matcher m = Pattern.compile("[A-z]+").matcher(line);
            while(m.find()) {
                strings.add(line.substring(m.start(), m.end()));
            }
        }
       return strings;
    }
}

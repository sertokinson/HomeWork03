import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2056 {
    public static void maxCountString(File f) throws IOException {
        String line,s;
        Matcher m;
        Integer count;
        int maximum=0;
        Map<String,Integer> map=new TreeMap<>();
        BufferedReader fin = new BufferedReader(new FileReader(f));
        while ((line = fin.readLine()) != null) {
            m = Pattern.compile("[A-z]+").matcher(line);
            while(m.find()) {
                count=1;
                s=line.substring(m.start(), m.end()).toLowerCase();
                if(map.containsKey(s)){
                    count=map.get(s)+1;
                    map.put(s,count);
                }
                map.put(s,count);
                maximum=Math.max(maximum,count);
            }
        }
        for (String string:map.keySet()) {
            if(map.get(string).equals(maximum))
                System.out.println(string);
        }
    }

    public static void main(String[] args) throws IOException {
        File f = new File("input.txt");
        maxCountString(f);
    }
}
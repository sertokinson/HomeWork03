import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static Map<String, Integer> countString(File f) throws IOException {
        String line,s;
        Matcher m;
        Integer count;
        Map<String,Integer> map=new HashMap<>();
        BufferedReader fin = new BufferedReader(new FileReader(f));
        while ((line = fin.readLine()) != null) {
            m = Pattern.compile("[A-z]+").matcher(line);
            while(m.find()) {
                count=1;
                s=line.substring(m.start(), m.end());
                if(map.containsKey(s)){
                    count=map.get(s)+1;
                    map.put(s,count);
                }

                map.put(s,count);


            }
        }
        return map;
    }

}






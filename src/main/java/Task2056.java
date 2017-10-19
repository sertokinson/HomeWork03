import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task2056 {
    public static void main(String[] args) throws IOException {
        String filename = "input.txt";
        List<String> lines = Files.readAllLines(Paths.get(filename), Charset.defaultCharset());
        List<String> strings = new ArrayList<>();
        String s1;
        for (String s : lines) {
                s1 = "";
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == ' ') {
                        strings.add(s1.toLowerCase());
                        s1 = "";
                    } else {
                        s1 += s.charAt(i);
                        if (i == s.length() - 1)
                            strings.add(s1.toLowerCase());
                    }
                }
        }
        Iterator<String> it = strings.iterator();
        int count;
        int[]a=new int[strings.size()];
        int k=0;
        int max=0;
        for (String s2 : strings) {
            a[k]=Collections.frequency(strings,s2);
            if (max<a[k])
                max=a[k];
            k++;
        }
        k=0;
        while (it.hasNext()) {
            String s3 = it.next();
            count=Collections.frequency(strings,s3);
            if (count>1){
                it.remove();
                a[k]=0;
            }
            k++;
        }
        k=0;
        for (String s2 : strings) {
            while(a[k]==0){
                k++;
            }
            if(a[k]==max) {
                System.out.println(s2);
            }
            k++;
        }
    }
}
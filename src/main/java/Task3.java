import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task3 {

    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        File f = new File("C:\\JavaSchool\\HomeWork_03\\text.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String s;
        String s1;
        while ((s = fin.readLine()) != null) {
            s1 = "";
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                    if (i == s.length() - 1) {
                        s1 += s.charAt(i);
                        if(s1 !="")
                            strings.add(s1);
                    } else
                        s1 += s.charAt(i);
                } else {
                    if(s1 !="")
                        strings.add(s1);
                    s1 = "";
                }
            }
        }
        Iterator<String> it = strings.iterator();
        int count;
        int[]a=new int[strings.size()];
        int k=0;
        for (String s2 : strings) {
            a[k]=Collections.frequency(strings,s2);
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
            System.out.println(s2+" "+a[k]);
            k++;
        }

    }
}






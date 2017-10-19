import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {

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
        Collections.sort(strings,new StringComparator());
        for (String s2 : strings) {
            System.out.println(s2);
        }
    }
}

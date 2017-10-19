import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Task4 {

    public static void main(String[] args) throws IOException {
        Deque<String> strings = new ArrayDeque<>();
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
                        if (s1 != "")
                            strings.add(s1);
                    } else
                        s1 += s.charAt(i);
                } else {
                    if (s1 != "")
                        strings.add(s1);
                    s1 = "";
                }
            }
        }
        while (strings.size()!=0) {
            System.out.println(strings.pollLast());
        }
    }
}
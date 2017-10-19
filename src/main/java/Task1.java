import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Task1 {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\JavaSchool\\HomeWork_03\\text.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        Collection<String> strings = new ArrayList();
        while ((line = fin.readLine()) != null) {
           strings.add(line);
        }
        int count = 0;
        for (String string:strings) {
            String s=string;
            s=s.replaceAll("\\W|\\d", " ");
            s=s.trim();
            String[] news=s.split(" ");
            for(int i=0;i<news.length;i++){
                if(news[i].length()!=0)
                    count++;
            }
        }
        System.out.println(count);
    }
}










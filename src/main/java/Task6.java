import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) throws IOException {
        Map<Integer,String > strings = new HashMap<>();
        File f = new File("C:\\JavaSchool\\Homeworks\\HomeWork_03\\newVersion\\collections\\text.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String s;
        Integer index=0;
        while ((s = fin.readLine()) != null) {
            strings.put(index++,s);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n=scanner.nextInt();
        int numberString;
        System.out.println("Введите номера строк: ");
        for(int i=0;i<n;i++){
            numberString=scanner.nextInt()-1;
            System.out.println(strings.get(numberString));
        }
    }

}





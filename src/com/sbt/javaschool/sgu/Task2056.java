package com.sbt.javaschool.sgu;

import java.io.*;
import java.util.*;

public class Task2056 {
    public static void main(String[] args) throws IOException {

        List<String> strings = new ArrayList<>();
        File f = new File("input.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String s;
        String s1;
        while ((s = fin.readLine()) != null) {
            s1="";
           for(int i=0;i<s.length();i++){
               if(s.charAt(i)==' '){
                   strings.add(s1.toLowerCase());
                   s1="";
               }
               else {
                   s1+=s.charAt(i);
                   if(i==s.length()-1)
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
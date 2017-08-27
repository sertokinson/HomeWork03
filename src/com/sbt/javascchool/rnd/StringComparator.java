package com.sbt.javascchool.rnd;

import java.util.Comparator;

class StringComparator implements Comparator<String> {

    public int compare(String a, String b){
        if (a.length()==b.length())
            return a.compareTo(b);
        else
        return a.length()-b.length();

    }
}
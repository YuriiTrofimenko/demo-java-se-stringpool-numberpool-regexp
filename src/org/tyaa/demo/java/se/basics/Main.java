package org.tyaa.demo.java.se.basics;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // String s1 = "Hello ";

	    // String s2 = "Java!";
        // String s3 = "Java!";

        // String s2 = new String("Java!");
        // String s3 = new String("Java!");

        // System.out.println(s2 == s3);
        // System.out.println(s2.equals(s3));

        /* Integer i1 = 127; // 42
        Integer i2 = 127; // 42

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2)); */
        // System.out.println(i1.compareTo(i2));


        String s1 = "egrhjeklkjk;911";
        String s2 = "tyaa@ukr.net";
        String s3 = "tyaa@ukr.net.ua";
        String s4 = "tyaa@@ukr.net";
        String s5 = "tyaa@ukr.net.ua.com";
        String s6 = "tyaa@ukr.";
        String s7 = "tyaa@ukrnet";
        // String rule = "^[a-z0-9-]{1,255}@[a-z0-9-]{1,25}(.[a-z]{2,3}){1,2}$";
        String rule = "^[a-z0-9-]{1,255}@[a-z0-9-]{1,25}([\\.][a-z]{2,3}){1,2}$";
        // System.out.println(s1.matches("^e[a-z0-9;]{1,}"));
        System.out.println(s1.matches(rule));
        System.out.println(s2.matches(rule));
        System.out.println(s3.matches(rule));
        System.out.println(s4.matches(rule));
        System.out.println(s5.matches(rule));
        System.out.println(s6.matches(rule));
        System.out.println(s7.matches(rule));

        // List.of(1, 8, 0).sort(Integer::compareTo);
        // Collections.sort(List.of(1, 8, 0));
    }
}

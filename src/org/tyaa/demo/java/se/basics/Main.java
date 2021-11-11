package org.tyaa.demo.java.se.basics;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

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
        /* System.out.println(s1.matches(rule));
        System.out.println(s2.matches(rule));
        System.out.println(s3.matches(rule));
        System.out.println(s4.matches(rule));
        System.out.println(s5.matches(rule));
        System.out.println(s6.matches(rule));
        System.out.println(s7.matches(rule)); */

        // List.of(1, 8, 0).sort(Integer::compareTo);
        // Collections.sort(List.of(1, 8, 0));
        // rule_1_OfAnnotation = "^+380[0-9]{8,9}";
        // String rule_2_OfAnnotation = "^+372[0-9]{8,9}";

        /* System.out.println("+33123456789".matches("^\\+380[0-9]{8,9}"));
        System.out.println("+38023456789".matches("^\\+380[0-9]{8,9}"));

        Pattern phonePattern = Pattern.compile("^\\+380[0-9]{8,9}");
        System.out.println(phonePattern.matcher("+33123456789").find());
        System.out.println(phonePattern.matcher("+38023456789").find()); */

        // String pattern = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
        /* String pattern = "\\d{10}|(\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
        System.out.println("1234567890".matches(pattern));
        System.out.println("123-456-7890".matches(pattern));
        System.out.println("(123)456-7890".matches(pattern));
        System.out.println("(123)4567890".matches(pattern)); */
        //\\d{10} matches 1234567890
        //(?:\d{3}-){2}\d{4} matches 123-456-7890
        //\(\d{3}\)\d{3}-?\d{4} matches (123)456-7890 or (123)4567890

        String url = "https://localhost:8080";
        String url2 = "https://localhost:8080/about";
        String url3 = "https://localhost:8080/items/?orderBy=date&sortingDirection=DESC";
        String url4 = "https://localhost:8080/items/101";
        String url5 = "https://localhost:8080/items/?q=orderBy:date;sortingDirection:DESC;price<:1000;categories:[1,3]";
        /* String[] results = url3.split("\\?");
        results = results[1].split("&");
        // System.out.println();
        Map<String, String> params = new HashMap<>();
        for (String s : results) {
            // System.out.println(s);
            params.put(s.split("\\=")[0], s.split("\\=")[1]);
        }
        params.forEach((key, value) -> System.out.printf("%s -> %s\n", key, value)); */

        /*
        * Pattern pattern = Pattern.compile("([\\w]+?)(:|<|>|<:|>:)([\\w\\]\\[\\,]+?);");
            Matcher matcher = pattern.matcher(searchModel.searchString + ";");
            while (matcher.find()) {
                builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
                * // TODO собрать все результаты в ArrayList, каждым элементом которого будет
                *     // массив из трех элементов: имя суб-параметра, оператор сравнения и значение,
                * // и вывести все данные списка в консоль
            }
        *  */
    }
}

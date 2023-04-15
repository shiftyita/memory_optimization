package it.shifty.exploringstrings;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        generateMillionStrings();
    }

    public static void test1() {
        String one = "hello";
        String two = "hello";

        System.out.println(one.equals(two));
        System.out.println(one == two);

        Integer i = 76;
        String three = i.toString().intern();
        String four = "76";

        System.out.println(three.equals(four));
        System.out.println(three == four);
    }

    public static void generateMillionStrings() throws InterruptedException {

        Date start = new Date();

        List<String> strings = new ArrayList<>();
        for (Integer i = 1; i < 10000000; i++) {
            String s = i.toString().intern();
            strings.add(s);
        }

        Date end = new Date();
        System.out.println("Elapsed time was "+ (end.getTime() - start.getTime()) + "ms.");
        Thread.sleep( Duration.ofSeconds( 5 ).toMillis() );
    }
}
package my_package;

import java.util.Scanner;

public class swapping_methods {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("swapping without third party");
        swapping_methods obj=new swapping_methods();
       boolean output= obj.swapping();
        System.out.println(output);

    }

    public  boolean swapping() {
        int a = 12;
        int b = 24;
        System.out.println("before swapping of a  is" + a);
        System.out.println("before swapping of b is" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("afret swapping of a is" + a);
        System.out.println("after swapping of b is" + b);

        boolean result = (a==24 && b==12) ;
        return result;
    }
}

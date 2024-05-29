package my_package;
import java.util.Scanner;
public class operators_using {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("arithmatic operators");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("relational operators");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("logical operators");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println("bitwise operators");
        int a3 =sc.nextInt();
        int b3 =sc.nextInt();
        System.out.println("unary operators");
        int a4 =sc.nextInt();
        int b4 =sc.nextInt();
        System.out.println("arithematic operators");
        System.out.println(a + b);
        System.out.println("relational operators");
        System.out.println(a< b);
        System.out.println(a > b);
        System.out.println("logical operators");
        System.out.println(a &b);
        System.out.println("bitwise operators");
        System.out.println(a^b);
        System.out.println("unary operators");
        System.out.println(++a);
        System.out.println(b++);
    }
}

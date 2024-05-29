package my_package;
import java.util.Scanner;
public class salary_amount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the salary amount");
        int salary=sc.nextInt();
        float monthly_salary=salary/12;
        System.out.println("monthly salary was:"+monthly_salary);
        System.out.println(monthly_salary<salary);
        String name="saro";
        System.out.println("workers name:"+name);
        long phone =987654432;
        System.out.println("workers phone no:"+phone);
        boolean salary_profit=(280000>230000);
        System.out.println("salary profit is:"+salary_profit);

    }
}

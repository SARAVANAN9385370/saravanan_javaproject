package my_package;
import java.util.Scanner;
public class insurance_details {
    public static void main(String[] args) {
        System.out.println("***************insurance details*************");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name =sc.next();
        System.out.println("customer id");
        int id =sc.nextInt();
        //type casting
    //widening
        double myDouble =id;
        //narrowing
        int id1=(int)myDouble;
        //user input get
        System.out.println("customer age");
        int age =sc.nextInt();
        System.out.println("customer blood group");
        String blood_group =sc.next();
        System.out.println("insurance_details");
        boolean insurance_details =sc.nextBoolean();
        System.out.println("customer phone no");
        long phone_no =sc.nextLong();
        System.out.println("customer address");
        String address=sc.nextLine();
        System.out.println("**********your details**************");
        System.out.println("customer id="+id);
        System.out.println("type casting of widening id="+myDouble);
        System.out.println("type casting of narrowing id="+id1);
        System.out.println("customer age="+age);
        System.out.println("customer blood group is"+blood_group);
        System.out.println("insurance_details="+insurance_details);
        System.out.println("customer phone no is="+phone_no);
        System.out.println("customer address is="+address);
        System.out.println("****************insurance End****************");
    //





    }
}

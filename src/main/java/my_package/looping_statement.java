package my_package;
import java.util.Scanner;
public class looping_statement {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
     looping_statement obj=new looping_statement();
             obj.while_loop();
    }
    public void while_loop()
    {
      int salary=24000;
      int staff=20;
      int entry_time=8;
      {while(20>0)
          {


              for(staff=0;staff<20;staff++) {
                  System.out.println("enter your entry time:");
                  double staff_entry = sc.nextDouble();
                  if (staff_entry <= entry_time) {
                      System.out.println("your entry was perfect ");
                  } else {
                      salary -= 100;
                      System.out.println(salary);
                      System.out.println("your current salary amount is:" + salary);
                      System.out.println("you are late entry");
                  }


              }


              }
          }










    }

}

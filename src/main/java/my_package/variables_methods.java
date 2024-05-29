package my_package;
import java.util.Scanner;

public class variables_methods {
    static Scanner sc = new Scanner(System.in);//static object
    String performer_name="saravanan";//golbal variable
    public static void main(String[] args)
    {
        String performer="saravanan of beginner";//instance variable
        System.out.println("student name");
        String name = sc.nextLine();
        System.out.println("student name is:" + name);
        variables_methods obj = new variables_methods();//object creation
        obj.Student_1();
        char gettingchar=obj.Student_2();
        System.out.println("first alphabet letter is :"+gettingchar);
        obj.Student_3("Manoj",22);
        int getting =obj.Student_4('D');
        System.out.println("student4 method retyurn integer value is :"+getting);
    }
    //without return type and without argument
    public void Student_1()
    {
        int reg = 12345;
        System.out.println("student reg no is:" + reg);
    }

    //with return type and without argument
    public char Student_2()
    {
        char section = 'a';
        System.out.println("student section is:" + section);
        return section;
    }
    //without return type and with argument
    public void Student_3(String a,int b)
    {
        String sub = "science";
        System.out.println("enter the subject" + sub);
        int sub1 = Integer.parseInt(sub);
        System.out.println("type parsing of sub to int is:" + sub1);
        int subject_mark = 95;
        System.out.println("subject mark in science is:" + subject_mark);

    }
    //with return type and with argument
    public int Student_4 ( char a)
    {
        char grade = 'A';
        System.out.println("Student grade is:" + grade);
        int grade_1 = (int) grade;
        System.out.println("type casting of Student grade to int" + grade_1);
        return grade_1;
    }


}



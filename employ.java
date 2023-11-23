import java.util.*;
class employdet{
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    int phone;
    String address;
    int salary;
    employdet(){
        name=sc.nextLine();
        age=sc.nextInt();
        phone=sc.nextInt();
        address=sc.nextLine();
        salary=sc.nextInt();

    }
    void salary(){

        System.out.println("salary"+salary);
    }

}
class officer extends employdet {
    String specizlization;

    void printdata(){
        System.out.println("name"+name+"age"+age+"phone"+phone+"address"+address+"salary"+salary+"specialization"+specizlization);

    }
    void spec(){
        System.out.println("enterr the specialization of the officer");
        specizlization=sc.nextLine();
    }

}
class manager  extends employdet{

    String dept;
    void printdata(){
        System.out.println("name"+name+"age"+age+"phone"+phone+"address"+address+"salary"+salary+"departement"+dept);
    }
    void dept(){
        System.out.println("enter the department");
        dept=sc.nextLine();
    }

}







public class inheritemploy {
    public static void main(String ah[]){

        System.out.println("enter the details of the officer");
        officer o=new officer();
        o.salary();
        o.spec();
        o.printdata();
        System.out.println("enter the details of the manager");
        manager m=new manager();
        m.salary();
        m.dept();
        m.printdata();


    }
}

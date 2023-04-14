
import java.util.*;
public class input_by_user {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the student");
        String name=sc.nextLine();
        System.out.println("enter the age of the student");
        int age=sc.nextInt();
        System.out.println("enter the date of birth of the student");
        int dob=sc.nextInt();
        System.out.println("**************************************");

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("DOB : "+dob);
        
        

    }
}

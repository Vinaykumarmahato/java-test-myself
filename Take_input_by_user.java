import java.util.*;

public class Take_input_by_user {

    public static void main(String[] args) {
        
        Scanner vinay =new Scanner(System.in);
        System.out.println("enter the name");
        String name=vinay.nextLine();
        System.out.println("enter the second number");
        int age=vinay.nextInt();

        System.out.println("name : "+name);
        System.out.println("age :"+age);
    }
    

}

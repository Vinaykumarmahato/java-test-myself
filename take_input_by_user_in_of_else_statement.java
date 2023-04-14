import java.util.Scanner;

public class take_input_by_user_in_of_else_statement {
    
    public static void main(String[] args) {

        Scanner vinay=new Scanner( System.in);
System.out.println("enter the A value");
        int a=vinay.nextInt();
        System.out.println("enter the B value");
        int b=vinay.nextInt();

        if(a>b){
            System.out.println("A is greater");

        }
        else{
            System.out.println("B is not greater");
        }
        
        
        
    }
}

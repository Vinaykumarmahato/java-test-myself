
import java.util.*;
public class table_print_by_taking_input {

    public static void main(String[] args) {
        
   

    Scanner vinay=new Scanner(System.in);

    System.out.println("Enter the number for print the table");
    int n =vinay.nextInt();
    
    for( int i =1; i<=10;i++){
    System.out.println(n*i);
    } 
}
}

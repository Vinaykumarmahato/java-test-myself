import java.util.*;

public class function9 {
    public static void factorialprinting(int n){
        if(n<0){
            System.out.println("invalid number");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner vinay=new Scanner(System.in);
        System.out.println("Enter the number for factorial number printing");
        int n=vinay.nextInt();
        factorialprinting(n);        
    }
    
}

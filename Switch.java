import java.util.*;
public class Switch {
    
    public static void main(String[] args) {

        Scanner vinay=new Scanner(System.in);

        System.out.println("start the pressing the buttom");

        int buttom=vinay.nextInt();

        switch(buttom){


            

            case 1: System.out.println("thanks for pressing 1 buttom now you can eat ");
            break;
            case 2: System.out.println("hey man why are you pressing 2 button");
            break;
            case 3: System.out.println("hey man why are you pressing 3 buttom");
            break;
            case 4: System.out.println("  hey man what are you doing");
            break;
            default : System.out.println(" you have pressed wrong buttom");
        }
        
        
    }
}



import java.util


public class testing {
    
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here you can perform calculation");
    
        int button = sc.nextInt();
    
        switch(button) {
            case 1:
                System.out.println("Press one for adding numbers");
                break;
            case 2:
                System.out.println("Press two for subtracting numbers");
                break;
            case 3:
                System.out.println("Press three for multiplying numbers");
                break;
            case 4:
                System.out.println("Press four for dividing numbers");
                break;
            default:
                System.out.println("Sorry! I can perform only addition, subtraction, multiplication, and division");
        }
    
        if(button == 1) {
            System.out.println("Addition");
        }
        else if(button == 2) {
            System.out.println("Subtraction");
        }
        else if(button == 3) {
            System.out.println("Multiplication");
        }
        else if(button == 4) {
            System.out.println("Division");
        }
    }
    
}

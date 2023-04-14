import java.io.*;
import java.lang.*;

public class thread1 extends Thread {

    public void run(){

        System.out.println(" ka ka");

    }
    
    public static void main(String[] args) {

        thread1 t=new thread1();
        t.start();
        t.start();
        

    }
}

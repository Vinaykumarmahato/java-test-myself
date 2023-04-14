import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.ReadPendingException;

public class Reading_console_input {

    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in) );
try{
        String name=reader.readLine();
        System.out.println(name);

    }catch(ReadPendingException r){

        System.out.println(r);
    }
    System.out.println("vinay kumar mahto");


    }
}
    



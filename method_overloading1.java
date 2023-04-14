
class vinay{
    void show(int a){

        System.out.println("1");
    }

    void show(Float b){

        System.out.println("2");

    }

}

public class method_overloading1 {
public static void main(String[] args) {
    

    vinay v=new vinay();
    
    v.show(null);
    v.show(0);
    // in this case it will generate am error and that error 
    // called ambiguity error

} 
    

}

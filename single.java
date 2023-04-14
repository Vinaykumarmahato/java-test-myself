
class parent{

    public void parentinfo(){
        System.out.println("this is parent class ");
    }
}
class child extends parent{
public void chi

ldinfo(){

        System.out.println("this is child class");
    }
   
}

public class single {
    public static void main(String[] args) {
        child vinay=new child();
        vinay.childinfo();
        vinay.parentinfo();
    }
    

}

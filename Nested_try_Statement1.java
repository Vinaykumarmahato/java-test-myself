public class Nested_try_Statement1 {
    
    public static void main(String[] args) {

        try{

            try{

                int vinay[]={10,20,30,45,0,5452,0,21,55};

                System.out.println(vinay[4]);
            }
            catch(ArrayIndexOutOfBoundsException a){

                System.out.println(a);

            }
            System.out.println(10/0);
        }
        catch(Exception e){

            System.out.println(e);
        }
        System.out.println("vinay kumar mahto");
    }
}
public class try_class {
    public static void main(String[] args) {
        
        try{
            try{
                int vinay[]={12,45,78,7489,455,85,85,85,855,85,745,57755,55,5555};

                System.out.println(vinay[8]);
            }
            catch(ArrayIndexOutOfBoundsException a){

                System.out.println(a);

            }
            System.out.println(10/0);

        }catch(ArithmeticException e){

            System.out.println(e);
        }

        System.out.println("my name is vinay kumar"); 

        

    }
}

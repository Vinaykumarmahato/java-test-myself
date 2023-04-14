
public class nested_try_block 
{
    public static void main(String[] args) {
        
    

    try{


        try{
             int a[]={10,20,30,45};

             System.out.println(a[3]);
        }
        catch(ArrayIndexOutOfBoundsException a){

            System.out.println(a);


        }
        System.out.println(10/0);


    }
    catch(ArithmeticException e)
    {
System.out.println(e);
    }
    System.out.println("vinay kumar mahto");
}

}  
       
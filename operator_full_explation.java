
public class operator_full_explation {
    
    /*operator is a simbol which is used to perform the task by user

    there are seven type of operator in java

    (1) Arithmetic operator: it is used to perfom the mathematical operation in java
    (2) logical Operator
    (3) Ternary operator
    (4) Assignment operator
    (5) Logical operator
    (6) Retational operator
    (7) Bitwise operator

     */

//Arithmetic operator: it is used to perfom the mathematical operation in java

// Example:- + , - , * , / , %
public static void main(String[] args) {
    
    int a=19,b=33,c,d,e,f,g;
    c=a+b;
    d=a-b;
    e=a*b;
    f=a/b;
    g=a%b;
System.out.println("Addition of two number is :"+c);
System.out.println("Subtration of two number is :"+d);
System.out.println("multiplitation of two number is :"+e);
System.out.println("devidation of two number is :"+f);
System.out.println("modulus of two number is :"+g);



// Relational operator:- it is used to define the relation between two operands
// it is very usefull for check the condition
// Example:- < , > ,<= . >= , !=(not equal)
System.out.println(a<b);
System.out.println(a>b);
System.out.println(a<=b);
System.out.println(a>=b);





// logical operator:- it check the logiclly the statement

// Example:- 3 is multiple by 3 , 1 is multiple by three

// in logical operator we will have two statement and both statement should be true
// then only it will give the output true otherwise it will give the output false.

// AND &  , || OR  , NOT !=
System.out.println("****************************");
System.out.println("Logical AND operator");
System.out.println((12>5) && (2>1));
System.out.println((12>2) && (12<2));
System.out.println((12<2) && (4>12));

System.out.println("logical OR operator");

System.out.println((12>5) ||  (2>1));
System.out.println((12>2) || (12<2));
System.out.println((12<2) || (4>12));

System.out.println("Logical NOT operator");
System.out.println(!(12>5));
System.out.println(!(12>2));
System.out.println(!(12<2));
}



    


}

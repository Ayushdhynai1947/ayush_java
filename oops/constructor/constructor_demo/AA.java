package oops.constructor.constructor_demo;

public class AA {

    public AA()// non-paremterised constructor
    {
        System.out.println(" Non parameterzied constructor called");

    }

    public AA(int num )  // paremeterized constructor 
    {
        System.out.println("paremterised constructor is called ");
    }

    public void method1 () //it is non static method 
    {
        System.out.println("methd1 called ");
    }

    public static void  method2()// it is static methdo
    {
        System.out.println("method2 called ");
    }
    
}

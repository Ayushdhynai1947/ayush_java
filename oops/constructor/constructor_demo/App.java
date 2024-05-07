package oops.constructor.constructor_demo;
import java.lang.SuppressWarnings;

@SuppressWarnings("unused")
public class App {
    public static void main(String[] args) 
	{
		//Command to create three objects from class AA
		AA o1=new AA();//Non-parameterized constructor will be called
		AA o2=new AA(40);//Parameterized constructor will be called
		AA o3=new AA();//Non-parameterized constructor will be called
		
		o1.method1();
		AA.method2();
	}
}

  


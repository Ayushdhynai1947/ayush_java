package oops.abstraction.arthematic;
import java.util.Scanner;

public  abstract class Arthematic_task {

    protected int num1;
    protected int num2;
    protected int res;

    public void acceptNumber(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter fist number :");
        this.num1 =sc.nextInt();
        System.out.println("Enter second number :");
        this.num2 =sc.nextInt();
    }
    
    public abstract void performTask();


    public void showresult()
    {
        System.out.println("result ="+this.res);
    }
}

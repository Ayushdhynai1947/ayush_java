package oops.date24_april;


public class oops1 {

     //instance variable , declare variable to hold state of product 
    int pid;
    String name;
    String brand;
    int price ;


     // defining variable to constructor 
    public oops1(int a1 , String a2 ,String a3 ,int a4){


        this.pid = a1;
        this.name = a2;
        this.brand = a3;
        this.price = a4;
        System.out.println(a1 +"," +a2 +","+a3+","+a4);
        System.out.println( this.pid);
    }
     // defining a  method 
    public void showDetails(){
        System.out.println("product id is :"+ this.pid);
        System.out.println("product id is :" +this.name);
        System.out.println("product id is :"+ this.brand);
        System.out.println("product id is :"+ this.price);
    }
    //setter and getter
    public int get_pid(){
        return this.pid;
    }

    public String get_name(){
        return this.name;
    }

    public String get_brand(){
        return this.brand;
    }

    public int get_price(){
        return this.price;
    }

    public void set_pid(int a6){
        this.pid =a6;

    }

    public void set_name(String a7){
        this.name =a7;
        
    }
    public void set_brand(String a8){
        this.brand =a8;
        
    }

    public void set_price(int a9){
        this.price =a9;
        
    }





}

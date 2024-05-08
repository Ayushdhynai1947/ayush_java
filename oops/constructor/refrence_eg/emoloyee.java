package oops.constructor.refrence_eg;



public class emoloyee {

    private String name;
    private String deparment ;
    private int salary; 

    public emoloyee(String arg1 , String args2,int args3)
    {
        this.name = arg1;
        this.deparment = args2;
        this.salary = args3;
    }
    
    public void showDetails(){
        System.out.println("Name is:"+ this.name);
        System.out.println("Deparemnet  is:"+ this.deparment);
        System.out.println("Name is:"+ this.salary);
        
    }
        
    }
    


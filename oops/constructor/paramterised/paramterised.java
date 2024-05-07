package oops.constructor.paramterised;

public class paramterised {
    private int v1;
    private float v2;
    private boolean v3;
    private char v4;
    private String v5;


    // default construct 
    public paramterised(){

    }

    public paramterised(int a1 ,float a2, boolean a3 , char a4, String a5){
        this.v1 =a1;
        this.v2 =a2;
        this.v3 =a3;
        this.v4 =a4;
        this.v5 = a5;
    }


    public void showVlaue(){
        System.out.println("value of v1 :"+ this.v1);
        System.out.println("value of v2 :"+ this.v2);
        System.out.println("value of v3 :"+ this.v3);
        System.out.println("value of v4 :"+ this.v4);
        System.out.println("value of v5 :"+ this.v5);
        
    }
    
    
}

package oops.constructor.copy_constructor;

public class AA {
    

    private int v1;
    private  float v2;
    private boolean v3;
    private char v4;
    private String v5;



    public AA(int a1,float a2,boolean a3,char a4,String a5){

        this.v1 = a1;
        this.v2 = a2;
        this.v3 = a3;
        this.v4 = a4;
        this.v5 = a5;
    }

    //default  copy construct 
    public AA(AA eo){

        this.v1 =eo.v1;
        this.v2 =eo.v2;
        this.v3 =eo.v3;
        this.v4 = eo.v4;
        this.v5 = eo.v5;
    }



    public void showVlaue(){
        System.out.println("value of v1 :"+ this.v1);
        System.out.println("value of v2 :"+ this.v2);
        System.out.println("value of v3 :"+ this.v3);
        System.out.println("value of v4 :"+ this.v4);
        System.out.println("value of v5 :"+ this.v5);
        
    }



    
    
}

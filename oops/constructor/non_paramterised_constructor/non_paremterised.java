package oops.constructor.non_paramterised_constructor;

public class non_paremterised {

    private int v1;
    private float v2;
    private boolean v3;
    private char v4;
    private String v5;

    public non_paremterised() {

        System.out.println("constructor called");

    }


    public void showVlaue(){
        System.out.println("value of v1 :"+ this.v1);
        System.out.println("value of v2 :"+ this.v2);
        System.out.println("value of v3 :"+ this.v3);
        System.out.println("value of v4 :"+ this.v4);
        System.out.println("value of v5 :"+ this.v5);
        
    }
    
}

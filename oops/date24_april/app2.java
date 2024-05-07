package oops.date24_april;

public class app2 {

    public static void main(String[] args) {
        

        oops2 p1;

        p1 = new oops2(23, 34);
        int x  = p1.getX();
        x =x+100;

        p1.setX(x);
        System.out.println("price of product is "+x);
    }
    
}

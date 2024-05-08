package oops.constructor.refrence_eg;

public class app {
    public static void main(String[] args) {
        emoloyee e1 = new emoloyee("AAA", "hod", 43);
        emoloyee e2 = new emoloyee("BBB", "account", 43);
        emoloyee e3 = new emoloyee("CCC", "marketing", 43);

        e2 = e1;
        e1.showDetails();
        e3 =e2;
        e2.showDetails();
        e1 =e3;
        e3.showDetails();
        
    }
    
}

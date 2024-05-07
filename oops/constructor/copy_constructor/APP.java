package oops.constructor.copy_constructor;

public class APP {

    public static void main(String[] args) {
        AA o1 =new AA(10, 78.4f, true, 'k', "cepta");
        AA o2 = new AA(o1);
        AA o3 = new AA(o1);
        o1.showVlaue();
        o2.showVlaue();
        o3.showVlaue();
    }
    
}

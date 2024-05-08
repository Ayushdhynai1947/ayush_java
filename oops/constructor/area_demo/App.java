package oops.constructor.area_demo;

public class App {
    public static void main(String[] args) {
        circle foo = new circle(5);
        foo.DisplayArea();
        foo.DisplayPerimter();

        //changing the raduis using setter
        foo.setRadious(7);
        foo.DisplayArea();
        foo.DisplayPerimter();
        
    }
    
}

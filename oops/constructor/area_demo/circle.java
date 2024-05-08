package oops.constructor.area_demo;



public class circle {

    private double radius;


    public circle(double  a){
        this.radius = a;
    }

    //getter to get the value 
    public double getRadius(){
        return radius;
    }


    public void setRadious(double radius){
        this.radius =radius;
    }
    
    public double calculaterPerimeter(){
        return 2*Math.PI*radius;

    }
    public double calculaterArea(){
        return 2*Math.PI*radius*radius;
    }

    public void DisplayArea(){
        System.out.println("area of the circle :"+ calculaterArea());
    }

    public void DisplayPerimter(){
        System.out.println("Perimter of the circle  "+ calculaterPerimeter());
    }

}

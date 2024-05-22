package dekstop_project;

import javax.swing.JFrame;

public class pratice1 {

    public pratice1(){
        JFrame frame = new JFrame("frame demo");
        frame.setSize(600,400);
        // frame.setLocationRelativeTo(null);
        frame.setLocation(500, 200);
        frame.setResizable(false);


        frame.setVisible(true);
    }
    

    public static void main(String[] args) {
       
        new pratice1();
    
}
}

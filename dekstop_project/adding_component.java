package dekstop_project;

import javax.swing.JButton;
import javax.swing.JFrame;

public class adding_component {
    JFrame frame = new JFrame("frame demo");
    JButton button1 = new JButton("Submit");
    JButton button2 = new JButton("Cancel");

    public adding_component(){
        
        frame.setSize(600,400);
        // frame.setLocationRelativeTo(null);
        frame.setLocation(500, 200);
        frame.setResizable(false);
        frame.setLayout(null);

        //command to create component and add into frame
      
        
        addbutton();  // this.addButton

        frame.setVisible(true);
    }

    private void addbutton(){
        frame.add(button1);
        button1.setBounds(50, 100, 120, 30);
        frame.add(button2);
        button2.setBounds(200, 100, 120, 30);
        
    }

    public static void main(String[] args) {


        new adding_component();
        
    }



    }
    


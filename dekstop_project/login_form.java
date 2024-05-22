package dekstop_project;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login_form {

    JFrame frame = new JFrame("Login");
    JLabel  label1 = new JLabel("enter user  id");
    JLabel label2 = new JLabel("Enter passsword id is");
    JTextField textbox1 =new JTextField();
    JPasswordField textbox2 = new JPasswordField();
    JButton button1 = new JButton("Submit");
    JButton button2 = new JButton("Cancel");

    public login_form(){

        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        addLabels();
        addtextbox();
        frame.setVisible(true);


    }

    private void addLabels(){
        label1.setBounds(50,100,150,30);
        frame.add(label1);
        label2.setBounds(50,160,150,30);
        frame.add(label2);
    }
    private void addtextbox(){
        textbox1.setBounds(200,100,250,30);
        frame.add(textbox1);
        textbox2.setBounds(200,160,2500,30);
        frame.add(textbox2);
    }

    public static void main(String[] args) {
        new login_form();
    }
    
}

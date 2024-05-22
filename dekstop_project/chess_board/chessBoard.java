package dekstop_project.chess_board;

import javax.swing.JButton;
import javax.swing.JFrame;

public class chessBoard {

    JFrame frame = new JFrame("Chess");
    JButton[] bt = new JButton[64]

    public chessBoard(){

        frame.setSize(1000,650);
        frame.setLocationRelativeTo(null);
        addButton();
        frame.setVisible(true);
    }

    private void addButton(){

        

        for(int i = 0;i<64;i++){

            bt[i] = new JButton();
            frame.add(bt[i])  ;   
        
        }



    }

    public static void main(String[] args) {

    new chessBoard();      
    }


    
}

import javax.swing.*;
import java.awt.GridLayout;

public class TicTacToe extends JFrame{

//https://stackoverflow.com/questions/31245320/how-to-add-a-button-to-a-jframe-gui

    JPanel controlPanel = new JPanel();
    JPanel panel=new JPanel();
    XOButton buttons[]=new XOButton[9];

    JButton resetButton = new JButton("Reset");

    public static void main(String args[]){
        new TicTacToe();
    }

    public TicTacToe(){
        super("TicTacToe");
        setSize(400,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++){
            buttons[i]=new XOButton();
            panel.add(buttons[i]);
        }
        add(panel);
        controlPanel.add(resetButton);

        setVisible(true);
    }
}
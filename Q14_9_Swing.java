/*Using SWING, write a program to display a string in frame window with pink color as 
background */

import javax.swing.*;
import java.awt.*;
public class Q14_9_Swing extends JFrame {
    JLabel label = new JLabel("THIS IS TO \n TEST LABEL");
    Q14_9_Swing(){
        setSize(600,600);
        setBackground(Color.MAGENTA);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(Color.MAGENTA);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font f = new Font("sans serif",Font.BOLD,50);
        label.setFont(f);
        label.setBounds(0,100,600,400);
        add(label);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        Q14_9_Swing obj = new Q14_9_Swing();
                    }
                }
        );
    }
}

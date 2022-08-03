/*Using SWING, write a program to create two buttons named “Red” and “Blue”. 
When a button is pressed the background color should be set to the color named 
by the button’s label.  */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q15_10_Swing extends JFrame {
    JButton btn1 ;
    JButton btn2;

    Q15_10_Swing(){
        setSize(600,600);
        setLayout(null);
        getContentPane().setBackground(Color.YELLOW);
        setVisible(true);
        btn1 = new JButton("Red");
        btn1.setBackground(Color.RED);
        btn1.setBounds(50,50,80,50);
        add(btn1);

        btn2 = new JButton();
        btn2.setBackground(Color.BLUE);
        btn2.setText("BLUE");
        btn2.setBounds(180,50,80,50);
        add(btn2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.RED);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.BLUE);
            }
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        Q15_10_Swing obj = new Q15_10_Swing();
                    }
                }
        );
    }
}

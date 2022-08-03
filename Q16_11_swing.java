/*Using SWING, write a program using appropriate adapter class todisplay themessage 
(“Typed character is: <typedCharacter>”)in the framewindowwhen user types any key.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q16_11_swing extends JFrame {
    JLabel label = new JLabel("type");

    Q16_11_swing(){
        setSize(600,600);
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);
        setVisible(true);

        Font f = new Font("sans serif",Font.BOLD,20);
        label.setFont(f);
        label.setBounds(10,250,300,40);

        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char typed = e.getKeyChar();
                label.setText("Typed character is : "+typed);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Q16_11_swing();
            }
        });
    }
}

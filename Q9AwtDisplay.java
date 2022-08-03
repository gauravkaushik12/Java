/*Using AWT, write a program to display a string in frame window with pink color as 
background */

import java.awt.*;
import java.awt.event.*;
public class Q9AwtDisplay extends Frame {
    Label label = new Label("THIS IS TO  TEST LABEL");
    Q9AwtDisplay(){
        setSize(600,600);
        setBackground(Color.MAGENTA);
        setVisible(true);
        setLayout(null);
        Font f = new Font("sans serif",Font.BOLD,50);
        label.setFont(f);
        label.setBounds(0,100,600,400);
        add(label);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Q9AwtDisplay obj = new Q9AwtDisplay();
    }
}

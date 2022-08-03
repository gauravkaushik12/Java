/*Using AWT, write a program using appropriate adapter class todisplay themessage 
(“Typed character is: <typedCharacter>”)in the framewindowwhen user types any key.*/

import java.awt.*;
import java.awt.event.*;

public class Q11AwtDisplayMessage extends Frame {
    Label label = new Label("type");
    Q11AwtDisplayMessage(){
        setSize(600,600);
        setBackground(Color.ORANGE);
        setLayout(null);
        setVisible(true);

        Font f = new Font("sans serif",Font.BOLD,20);
        label.setFont(f);
        label.setBounds(10,250,300,40);
        add(label);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char typed = e.getKeyChar();
               label.setText("Typed character is : "+typed);
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Q11AwtDisplayMessage obj = new Q11AwtDisplayMessage();
    }
}

/*Write  a  program  to  create  a  frameusing  AWT.  Implement  mouseClicked(), 
mouseEntered() and mouseExited() eventssuch that:
a)Size of the frame should be tripled when mouse entersit.
b)Frame should reduce to its original size when mouse is clicked in it.
c)Close the frame when mouse exitsit. */

import java.awt.*;
import java.awt.event.*;

public class Q8AwtFrame extends Frame  {
    int w=600;
    int h=600;

    Q8AwtFrame(){
        setSize(w,h);
        setBackground(Color.BLUE);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setSize(w,h);
            }
            public void mouseEntered(MouseEvent e) {
                setSize(3*w,3*h);
            }
            public void mouseExited(MouseEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Q8AwtFrame obj = new Q8AwtFrame();
    }
}

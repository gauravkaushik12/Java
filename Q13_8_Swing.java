// SWING
/*Write  a  program  to  create  a  frameusing  AWT.  Implement  mouseClicked(), 
mouseEntered() and mouseExited() eventssuch that:
a)Size of the frame should be tripled when mouse entersit.
b)Frame should reduce to its original size when mouse is clicked in it.
c)Close the frame when mouse exitsit. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class Q13_8_Swing  {
        int w=600;
        int h=600;
        Q13_8_Swing(){

            JFrame jf = new JFrame();
            jf.setTitle("QUESTION - 8 ");
            jf.setSize(w,h);

            jf.getContentPane().setBackground(Color.GREEN);
            jf.setLayout( null);
            jf.setVisible(true);

           jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          jf.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    jf.setSize(w,h);
                }
                public void mouseEntered(MouseEvent e) {
                    jf.setSize(3*w,3*h);
                }
                public void mouseExited(MouseEvent e) {
                    System.exit(0);
                }
            });
        }
        public static void main(String[] args) {
            SwingUtilities.invokeLater(
                    new Runnable() {
                        @Override
                        public void run() {
                            Q13_8_Swing tt = new Q13_8_Swing();
                        }
                    }
            );
        }
    }

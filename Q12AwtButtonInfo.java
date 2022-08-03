/*Using AWT, write a program to create two buttons labelled ‘A’ and ‘B’. When button 
‘A’ is pressed, it displays your personal information (Name, Course, Roll No, College)
and when button ‘B’ is pressed, it displays your CGPA in previous semester.*/

import java.awt.*;
import java.awt.event.*;
public class Q12AwtButtonInfo extends Frame {
    Button btn1;
    Button btn2;

    Label label;
    Q12AwtButtonInfo(){
         setSize(600,600);
         setBackground(Color.ORANGE);
         setVisible(true);
         setLayout(null);

         label = new Label("press Buttons");
        Font f = new Font("sans serif",Font.BOLD,10);
        label.setFont(f);
        label.setBounds(10,100,600,400);

         btn1 = new Button("A");
         btn1.setBackground(Color.GREEN);
         btn2 = new Button("B");
         btn2.setBackground(Color.GREEN);

         btn1.setBounds(30,50,50,50);
         btn2.setBounds(100,50,50,50);

         btn1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                    label.setText("NAME : GAURAV KAUSHIK , COURSE : BSC CS , ROLL NO. : 10912 , COLLEGE : KESHAV MAHAVIDYALAY");
             }
         });
         btn2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 label.setText("CGPA in SEM. : 9.1 ");
             }
         });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        add(btn1);
        add(btn2);
        add(label);
    }
    public static void main(String[] args) {
        Q12AwtButtonInfo obj = new Q12AwtButtonInfo();
    }
}

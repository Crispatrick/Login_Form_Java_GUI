import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class welcomePage extends Designs{
    welcomePage(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(350,300);
        frame.setTitle("Fylart"); 
        frame.getContentPane().setBackground(new Color(bg1[0],bg1[1],bg1[2]));    

        JLabel welcome = new JLabel("Welcome Anon");
        welcome.setForeground(new Color(txtColorWhite[0],txtColorWhite[1],txtColorWhite[2]));
        welcome.setBounds(20, 0, 200, 20);

        frame.add(welcome);
        frame.setVisible(true);

    }
}

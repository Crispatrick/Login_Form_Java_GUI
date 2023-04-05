import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App extends Designs implements ActionListener{
    static JButton submit;
    static JTextField userinput;
    static JTextField passwordInput;
    static JLabel error;
    static JPanel userinfo;

    public static void main(String[] args) {
        int[] bgRBG = {65, 53, 67};
        int[] txtColorWhite = {255,255,255};

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(350,300);
        frame.setTitle("Fylart"); 
        frame.getContentPane().setBackground(new Color(bg1[0],bg1[1],bg1[2]));

        JLabel heading = new JLabel("Login");
        heading.setFont(new Font("arial", Font.BOLD,50));        
        heading.setForeground(new Color(txtColorWhite[0],txtColorWhite[1],txtColorWhite[2]));
        
        /*
        JPanel hpanel = new JPanel();
        hpanel.setBackground(Color.WHITE);
        hpanel.add(heading);
        */
        
        //* Done == username
        JLabel username = new JLabel("Username");
        username.setFont(new Font("arial", Font.PLAIN,20));        
        username.setForeground(new Color(txtColorWhite[0],txtColorWhite[1],txtColorWhite[2]));
        username.setHorizontalAlignment(JLabel.LEFT);
        username.setBounds(20, 0, 200, 20);

        userinput = new JTextField(10);
        userinput.setBounds(130, 0, 150, 20);

        int passheight = 40;

        JLabel password = new JLabel("Password");
        password.setFont(new Font("arial", Font.PLAIN,20));        
        password.setForeground(new Color(txtColorWhite[0],txtColorWhite[1],txtColorWhite[2]));
        password.setHorizontalAlignment(JLabel.LEFT);
        password.setBounds(20, passheight, 200, 20);

        passwordInput = new JTextField(10);
        passwordInput.setBounds(130, passheight, 150, 20);

        submit = new JButton("Enter");
        submit.setBounds(195, (passheight + 40), 85, 30);
        submit.setFocusable(false);
        submit.setBackground(new Color(0x8F43EE));
        submit.setFont(new Font("arial", Font.BOLD,20));
        submit.setForeground(new Color(0x2D2727));
        submit.addActionListener(new App());
        
        error = new JLabel("Wrong username or password");
        error.setFont(new Font("arial", Font.PLAIN,10));        
        error.setForeground(new Color(txtColorWhite[0],txtColorWhite[1],txtColorWhite[2]));
        error.setHorizontalAlignment(JLabel.LEFT);
        error.setBounds(30, (passheight + 45), 200, 20);
        error.setVisible(false);
        

        /*
        JPanel hpanel1 = new JPanel();
        hpanel1.setBackground(Color.black);
        hpanel1.add(heading1);
        hpanel1.setBounds(100, 100, 200, 200);

        /*
        JLabel user = new JLabel();
        heading.setText("Username: ");
        heading.setFont(new Font("arial", Font.PLAIN,20));        
        heading.setForeground(new Color(255,255,255));
        */

        //* Done == TODO change the goddamn bgcolor shinji!!
        JPanel login = new JPanel();
        login.setBackground(new Color(bgRBG[0],bgRBG[1],bgRBG[2]));
        login.setBounds(15, 15, 300, 100);
        login.add(heading);

        userinfo = new JPanel();
        userinfo.setBackground(new Color(bgRBG[0],bgRBG[1],bgRBG[2]));
        userinfo.setBounds(15, 100, 300, 150);
        userinfo.setLayout(null);
        userinfo.add(username);
        userinfo.add(userinput);
        userinfo.add(password);
        userinfo.add(passwordInput);
        userinfo.add(error);
        userinfo.add(submit);
        

        //ImageIcon logo = new ImageIcon(imgnamehere);
        //this.setIconImage(getIconImage(logo));
        //frame.getContentPane().setBackground(new Color(0,0,0));

        frame.add(userinfo);
        frame.add(login);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==submit) {
            if (userinput.getText().equalsIgnoreCase("anon") && passwordInput.getText().equalsIgnoreCase("anonspassword")) {
                System.out.println("testing");
                new welcomePage();

            }else{
                error.setVisible(true);
            }


        }
    }
}

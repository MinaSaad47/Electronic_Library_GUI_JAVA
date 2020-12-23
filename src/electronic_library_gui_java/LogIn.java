/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lm47
 */
public class LogIn extends JFrame implements ActionListener {
    Dimension dim;
    
    ImageIcon icon;
    JLabel welcome, email, password;
    JTextField t_email, t_Password;
    JButton signIn, createAccount;
    
    Color cWhite = Color.white;
    Color cBackground = new Color(51, 51, 51);
    
    CreateAccount m_CreateAccount;
    
    LogIn() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Log In");
        this.setIconImage((icon = new ImageIcon("img/login_icon.png")).getImage());
        this.setSize(400, 800);
        
        // Put the window to the center of the screen
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        this.getContentPane().setBackground(cBackground);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(null);
        
        welcome = new JLabel("Welcome.");
        welcome.setBounds(10, 30, 390, 40);
        welcome.setFont(new Font(null, Font.BOLD, 28));
        welcome.setForeground(cWhite);
         
        
        email = new JLabel("Email");
        email.setForeground(cWhite);
        email.setFont((new Font(null, Font.PLAIN, 20)));
        email.setBounds(10, 100, 200, 40);
                
        
        password = new JLabel("Password");
        password.setForeground(cWhite);
        password.setFont((new Font(null, Font.PLAIN, 20)));
        password.setBounds(10, 200, 200, 40);
        
        t_email = new JTextField();
        t_email.setBounds(10, 150, 380, 40);
        t_email.setBackground(cBackground);
        t_email.setForeground(cWhite);
        t_email.setFont(new Font(null, Font.BOLD, 16));
        t_email.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
        
        t_Password = new JTextField();
        t_Password.setBounds(10, 250, 380, 40);
        t_Password.setBackground(cBackground);
        t_Password.setForeground(cWhite);
        t_Password.setFont(new Font(null, Font.BOLD, 16));
        t_Password.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
        
        signIn = new JButton("Sign In");
        signIn.setBounds(10, 600, 380, 40);
        signIn.setFocusable(false);
        
        createAccount = new JButton("Create An Account");
        createAccount.setBounds(10, 650, 380, 40);
        createAccount.setFocusable(false);
        createAccount.addActionListener(this);

        this.add(welcome);
        this.add(email);
        this.add(password);
        this.add(t_email);
        this.add(t_Password);
        this.add(signIn);
        this.add(createAccount);
        
        
    }
    
    LogIn(String text, Point location) {
        
        this();
        welcome.setText(text);
        this.setLocation(location);
        
        
    }
    

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == createAccount) {
            this.dispose();
            m_CreateAccount = new CreateAccount(this.getLocation());
        }
    }
}

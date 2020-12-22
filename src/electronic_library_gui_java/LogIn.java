/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lm47
 */
public class LogIn {
    JFrame login;
    ImageIcon icon;
    JLabel welcome, userName, password;
    JTextField t_Username, t_Password;
    JButton signIn, createAccount;
    
    Color cWhite = Color.white;
    Color cBackground = new Color(51, 51, 51);
    
    LogIn() {
        login = new JFrame();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setTitle("Login");
        login.setIconImage((icon = new ImageIcon("img/login_icon.png")).getImage());
        login.setSize(400, 800);
        login.getContentPane().setBackground(cBackground);
        login.setResizable(false);
        login.setVisible(true);
        login.setLayout(null);
        welcome = new JLabel("Welcome");
        welcome.setBounds(10, 30, 200, 40);
        welcome.setFont(new Font(null, Font.BOLD, 28));
        welcome.setForeground(cWhite);
         
        
        userName = new JLabel("username");
        userName.setForeground(cWhite);
        userName.setFont((new Font(null, Font.PLAIN, 20)));
        userName.setBounds(10, 100, 200, 40);
                
        
        password = new JLabel("password");
        password.setForeground(cWhite);
        password.setFont((new Font(null, Font.PLAIN, 20)));
        password.setBounds(10, 200, 200, 40);
        
        t_Username = new JTextField();
        t_Username.setBounds(10, 150, 380, 40);
        t_Username.setBackground(cBackground);
        t_Username.setForeground(cWhite);
        t_Username.setFont(new Font(null, Font.PLAIN, 16));
        
        t_Password = new JTextField();
        t_Password.setBounds(10, 250, 380, 40);
        t_Password.setBackground(cBackground);
        t_Password.setForeground(cWhite);
        t_Password.setFont(new Font(null, Font.PLAIN, 16));
        
        
        signIn = new JButton("Sign In");
        signIn.setBounds(10, 600, 380, 40);
        signIn.setFocusable(false);
        
        createAccount = new JButton("Create An Account");
        createAccount.setBounds(10, 650, 380, 40);
        createAccount.setFocusable(false);

        login.add(welcome);
        login.add(userName);
        login.add(password);
        login.add(t_Username);
        login.add(t_Password);
        login.add(signIn);
        login.add(createAccount);
        
        
    }
}

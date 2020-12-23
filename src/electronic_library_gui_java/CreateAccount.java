/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.border.Border;

/**
 *
 * @author lm47
 */
public class CreateAccount extends JFrame implements ActionListener {
    Color cWhite = Color.white;
    Color cBackground = new Color(51, 51, 51);
    Font font1 = new Font(null, Font.PLAIN, 20),
         font2 = new Font(null, Font.BOLD, 12);
    Border border = BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY);
    
    Label1 m_FristName, m_LastName, m_Email, m_Password, m_Address, m_CellPhone, m_Gender, m_Type;
    TextField1 m_t_FirstName, m_t_LastName, m_t_Email, m_t_Password, m_t_Address, m_t_CellPhone;
    ComboBox1 m_c_Gender, m_c_Type;
    Button1 m_CreateAccount;
    
    String m_Genders[] = {"Male", "Female", "Something In Between"};
    String m_Types[] = {"Librarian", "Member"};
    
    
    public CreateAccount(Point location) {
        this.setSize(400, 800);
        this.setLocation(location);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        
        
        this.getContentPane().setBackground(cBackground);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(null);
        
        
        m_FristName = new Label1("Frist Name:", font1, new Rectangle(10, 10, 180, 50), cWhite);
        m_t_FirstName = new TextField1(font2, new Rectangle(10, 60, 180, 50), cWhite, cBackground, border);
        
        m_LastName = new Label1("Last Name:", font1, new Rectangle(190, 10, 190, 50), cWhite);
        m_t_LastName = new TextField1(font2, new Rectangle(200, 60, 190, 50), cWhite, cBackground, border);
        
        m_Email = new Label1("Email:", font1, new Rectangle(10, 110, 180, 50), cWhite);
        m_t_Email = new TextField1(font2, new Rectangle(10, 160, 380, 50), cWhite, cBackground, border);
        
        m_Password = new Label1("Password:", font1, new Rectangle(10, 210, 180, 50), cWhite);
        m_t_Password = new TextField1(font2, new Rectangle(10, 260, 380, 50), cWhite, cBackground, border);
        
        
        m_Address = new Label1("Address:", font1, new Rectangle(10, 310, 180, 50), cWhite);
        m_t_Address = new TextField1(font2, new Rectangle(10, 360, 380, 50), cWhite, cBackground, border);
        
        
        m_CellPhone = new Label1("Cell Phone:", font1, new Rectangle(10, 410, 180, 50), cWhite);
        m_t_CellPhone = new TextField1(font2, new Rectangle(10, 460, 380, 50), cWhite, cBackground, border);
        
        
        m_Gender = new Label1("Gender:", font1, new Rectangle(10, 510, 180, 50), cWhite);
        m_c_Gender = new ComboBox1(m_Genders, font2, new Rectangle(10, 560, 180, 30));
        
        m_Type = new Label1("Type:", font1, new Rectangle(200, 510, 190, 50), cWhite);
        m_c_Type = new ComboBox1(m_Types, font2, new Rectangle(200, 560, 190, 30));
        
        m_CreateAccount = new Button1("Create Account", new Rectangle(10, 650, 380, 40), this);
       
        
        this.add(m_FristName);
        this.add(m_t_FirstName);
        this.add(m_LastName);
        this.add(m_t_LastName);
        this.add(m_Email);
        this.add(m_t_Email);
        this.add(m_Password);
        this.add(m_t_Password);
        this.add(m_Address);
        this.add(m_t_Address);        
        this.add(m_CellPhone);
        this.add(m_t_CellPhone);
        this.add(m_Gender);
        this.add(m_c_Gender);
        this.add(m_Type);
        this.add(m_c_Type);
        this.add(m_CreateAccount);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == m_CreateAccount) {
            this.dispose();
            JOptionPane.showMessageDialog(this, "Your Account Has Been Created!");

            new LogIn("Welcome Back.", this.getLocation());
        }
    }
    
    
    
}

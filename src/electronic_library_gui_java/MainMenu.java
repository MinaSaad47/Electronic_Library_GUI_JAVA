/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

import java.util.Scanner;

/**
 *
 * @author lm47
 */
public class MainMenu {
    private static Scanner in = new Scanner(System.in);

    public MainMenu() {
        main_menu();
    }
    
    private void main_menu() {
        System.out.printf("Main_Menu:\n\n");
        System.out.printf("\t[1] Sign In\t[2] Sign Up\n");
        System.out.printf("Enter Your Answer: ");
        int ans = in.nextInt();
        if (ans == 1)
            sign_in();
        else if (ans == 2)
            sign_up();
        else {
            System.out.printf("\tError: Invalid\n");
            main_menu();
        }   
    }
    private void sign_in() {
        System.out.printf("Log In:\n\n");
        System.out.printf("Enter Your Email: ");
        String email = in.next();
        System.out.printf("Enter Your Password: ");
        String password = in.next();
        int emailCheck = DB.check("SELECT * FROM person", 4, email); // 4
        int passCheck = DB.check("SELECT * FROM person", 5, password); // 4
        if (emailCheck == passCheck && emailCheck != 0) {
            System.out.printf("Success!\n");
        } 
        else {
            System.out.printf("\tError: Failed To Log In!\n");
        }
    }
    private void sign_up() {
        
    }
}

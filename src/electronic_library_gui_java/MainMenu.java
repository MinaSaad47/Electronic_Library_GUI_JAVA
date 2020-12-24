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
        Print.menu("Main Menu");
        Print.list("[1] Sign In\t[2] Sign Up");
        Print.prompt("Your Answer");
        int ans = in.nextInt();
        if (ans == 1)
            sign_in();
        else if (ans == 2)
            sign_up();
        else {
            Print.error("Invalid Answer");
            main_menu();
        }   
    }
    private void sign_in() {
        Print.menu("Log In");
        Print.prompt("Your Email");
        String email = in.next();
        Print.prompt("Your Password");
        String password = in.next();
        int emailId = DB.check("SELECT * FROM person", 4, email); // 4
        int passId = DB.check("SELECT * FROM person", 5, password); // 4
        if (emailId == passId && passId != 0) {
            System.out.printf("Success!\n");
             
        } 
        else {
            Print.error("Failed To Log In");
        } // SELECT * FROM person WHERE id = myid
        if (DB.check("SELECT type FROM person WHERE id = " + String.valueOf(emailId), 1, "librarian") != 0) {
            new Dashboard();
        }
       
    }
    private void sign_up() {
        Print.menu("Sign Up");
        Print.list("As a [1] Reader or as [2] Librarian");
        int ans = in.nextInt();
        Person lib;
        Person usr;

        if (ans == 1) {
            usr = new User();
            Print.prompt("Your First Name");
            usr.fristName(in.next());
            Print.prompt("Your Second Name");
            usr.secondName(in.next());
            Print.prompt("Your Password");
            usr.password(in.next());
            Print.prompt("Your Email");
            usr.email(in.next());
            Print.prompt("Your Address");
            usr.address(in.next());
            Print.prompt("Your Cell phone");
            usr.cellPhone(in.next());
            Print.prompt("Your Gender");
            usr.gender(in.next());
            DB.insert(usr);
            
        }
        else if (ans == 2) {
           lib = new Librarian();
           lib = new User();
           Print.prompt("Your First Name");
           lib.fristName(in.next());
           Print.prompt("Your Second Name");
           lib.secondName(in.next());
           Print.prompt("Your Password");
           lib.password(in.next());
           Print.prompt("Your Email");
           lib.email(in.next());
           Print.prompt("Your Address");
           lib.address(in.next());
           Print.prompt("Your Cell phone");
           lib.cellPhone(in.next());
           Print.prompt("Your Gender");
           lib.gender(in.next());
           DB.insert(lib);
           
        }
        else {
            Print.error("Invalid Answer");
            sign_up();
        }
        sign_in();
    
    }
}

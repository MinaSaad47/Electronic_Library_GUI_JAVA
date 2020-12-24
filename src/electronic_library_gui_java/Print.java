/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

/**
 *
 * @author lm47
 */
public class Print {
    public static void menu(String menu) {
        for (int i = 0; i < 60; i++) {
            System.out.printf("-");
        }
        System.out.printf("\n|\t\t\t%s\t\t\t\n", menu);
        for (int i = 0; i < 60; i++) {
            System.out.printf("-");
        }
        System.out.printf("\n\n");
    }
    
    public static void list(String list) {
        System.out.printf("\t");
        for (int i = 0; i < list.length() + 13; i++) {
            System.out.printf("-");
        }
        System.out.printf("\n\t| %s |\n", list);
        System.out.printf("\t");
        for (int i = 0; i < list.length() + 13; i++) {
            System.out.printf("-");
        }
        System.out.printf("\n\n");
    }
    
    public static void prompt(String prompt) {
        System.out.printf("Enter << %s >> ", prompt);
    }
    
    public static void error(String error) {
        System.out.printf("\t");
        for (int i = 0; i < error.length() + 12; i++) {
            System.out.printf("-");
        }
        System.out.printf("\n\t| Error: %s! |\n", error);
        System.out.printf("\t");
        for (int i = 0; i < error.length() + 12; i++) {
            System.out.printf("-");
        }
        System.out.printf("\n\n");
    }
}

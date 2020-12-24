/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author lm47
 */
public class DB {
    public DB() {
   
    }
    public static void query(String query, int colNum) {
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/library","goo1","#Goo123456");  
            
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);  
            while(rs.next()) {
                for (int i = 1; i <= colNum; i++) {
                    System.out.printf("%s\t", rs.getString(i));
                    
                }
                if (colNum == 0) {
                    System.out.printf("\n");
                }
                
            } 
            con.close();  
        }
        catch (Exception e) { 
            System.out.println(e);    
        }
    }
    /*
    public static int check(String query, int cols[], String value[]) {
       try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/library","goo1","#Goo123456");  
            
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);  
            while(rs.next()) {
                boolean isFound = false;
                for (int i = 0; i < cols.length; i++) {
                    if (rs.getString(cols[i]).equals(value[i])) {
                        isFound = true;
                    }
                    else {
                        isFound = false;
                    }
                }
                if (isFound) {
                    return rs.getInt(1);
                }
                  
            } 
            con.close();  
        }
        catch (Exception e) { 
            System.out.println(e);    
        }
       return 0;
    }
*/
    
    public static int check(String query, int col, String value) {
       try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/library","goo1","#Goo123456");  
            
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);  
            while(rs.next()) {
                boolean isFound = false;
                
                if (rs.getString(col).equals(value)) {
                    isFound = true;
                }
                else {
                    isFound = false;
                }
                
                if (isFound) {
                    return rs.getInt(1);
                }
                  
            } 
            con.close();  
        }
        catch (Exception e) { 
            System.out.println(e);    
        }
       return 0;
    }
 
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

/**
 *
 * @author GOO1
 */
public class Librarian extends Person {
    
    // Constructor
    public Librarian() {
        super();
        super.type("Librarian");
    }
    public Librarian(int id, String password, String fristName, String secondName, String address, String cellPhone, String email, String sex) {
        super(id, password, fristName, secondName, address, cellPhone, email, sex, "Librarian");
        
    }
    // END of Constructor
    
    
    
    
    
}

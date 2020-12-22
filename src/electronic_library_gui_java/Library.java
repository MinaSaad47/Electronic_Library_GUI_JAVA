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
public class Library {
    
    private static Book m_Book[] = new Book[100000];
    private static Librarian m_Librarian[] = new Librarian[100000];
    private static User m_User[] = new User[100000];
    
    public Library() {
        
    }
    
    public static void addBook(Book book) {
        for (int i = 0; i < 100000; i++) {
            if (m_Book[i] == null) {
                m_Book[i] = book;
                break;
            }
        }
    }
    
    public static void addLibrarian(Librarian librarian) {
        for (int i = 0; i < 100000; i++) {
            if (m_Librarian[i] == null) {
                m_Librarian[i] = librarian;
                break;
            }
        }
    }
    
    public static void addUser(User user) {
        for (int i = 0; i < 10000; i++) {
            if (m_User[i] == null) {
                m_User[i] = user;
                break;
            }
        }
    }
    
    public static void removeBook(int id) {
        for (int i = 0; m_Book[i] != null; i++) {
            if (m_Book[i].id() == id) {
                m_Book[i] = null;
                break;
            }
        }
    }
    
    public static void removeUser(int id) {
        for (int i = 0; m_User[i] != null; i++) {
            if (m_User[i].id() == id) {
                m_User[i] = null;
                break;
            }
        }
    }
    
    public static Book searchBook(int id) {
        for (int i = 0; m_Book[i] != null; i++) {
            if (m_Book[i].id() == id) {
                return m_Book[i];
            }
        }
        return null;
    }
    
    public static Book searchBook(String name) {
        for (int i = 0; m_Book[i] != null; i++) {
            if (m_Book[i].name().equals(name)) {
                return m_Book[i];
            }
        }
        return null;
    }
    
    public static User searchUser(int id) {
        for (int i = 0; m_User[i] != null; i++) {
            if (m_User[i].id() == id) {
                return m_User[i];
            }
        }
        return null;
    }
    
}

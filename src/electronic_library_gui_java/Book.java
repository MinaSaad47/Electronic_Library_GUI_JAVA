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
public class Book {
    private int m_Id;
    private String m_Name;
    private String m_Author;
    private String m_ReleaseDate;
    private String m_NumOfPages;
    private String m_Genre;

    // Constructor
    public Book(int m_Id, String m_Name, String m_Author, String m_ReleaseDate, String m_NumOfPages, String m_Genre) {
        this.m_Id = m_Id;
        this.m_Name = m_Name;
        this.m_Author = m_Author;
        this.m_ReleaseDate = m_ReleaseDate;
        this.m_NumOfPages = m_NumOfPages;
        this.m_Genre = m_Genre;
    }
    // END of Constructor

    // Getters
    public int id() {
        return m_Id;
    }

    public String name() {
        return m_Name;
    }

    public String author() {
        return m_Author;
    }

    public String releaseDate() {
        return m_ReleaseDate;
    }

    public String numOfPages() {
        return m_NumOfPages;
    }

    public String genre() {
        return m_Genre;
    }
    // END of Getters

    
    // Setter
    public void id(int m_Id) {
        this.m_Id = m_Id;
    }

    public void name(String m_Name) {
        this.m_Name = m_Name;
    }

    public void author(String m_Author) {
        this.m_Author = m_Author;
    }

    public void releaseDate(String m_ReleaseDate) {
        this.m_ReleaseDate = m_ReleaseDate;
    }

    public void numOfPages(String m_NumOfPages) {
        this.m_NumOfPages = m_NumOfPages;
    }

    public void genre(String m_Genre) {
        this.m_Genre = m_Genre;
    }
    // END of Setters
    
    
    
    
}

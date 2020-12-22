/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

/**
 *
 * @author G001
 */
public class Person {
    private int m_Id;
    private String m_Password;
    private String m_FristName;
    private String m_SecondName;
    private String m_Address;
    private String m_CellPhone;
    private String m_Email;
    private String m_Sex;
    private String m_Type;
    private Boolean m_IsBlocked = false;
    
    // Constructor
    public Person(int m_Id, String m_Password, String m_FristName, String m_SecondName, String m_Address, String m_CellPhone, String m_Email, String m_Sex, String m_Type) {
        this.m_Id = m_Id;
        this.m_Password = m_Password;
        this.m_FristName = m_FristName;
        this.m_SecondName = m_SecondName;
        this.m_Address = m_Address;
        this.m_CellPhone = m_CellPhone;
        this.m_Email = m_Email;
        this.m_Sex = m_Sex;
        this.m_Type = m_Type;
    }
    // END of Constructor
    
    
    
    
    // Getters
    public int id() {
        return m_Id;
    }

    public String password() {
        return m_Password;
    }

    public String fristName() {
        return m_FristName;
    }

    public String secondName() {
        return m_SecondName;
    }

    public String address() {
        return m_Address;
    }

    public String cellPhone() {
        return m_CellPhone;
    }

    public String email() {
        return m_Email;
    }

    public String sex() {
        return m_Sex;
    }

    public String type() {
        return m_Type;
    }

    public Boolean isBlocked() {
        return m_IsBlocked;
    }
    // END of Getters
    
    
    // Setters
    public void id(int m_Id) {
        this.m_Id = m_Id;
    }

    public void password(String m_Password) {
        this.m_Password = m_Password;
    }

    public void fristName(String m_FristName) {
        this.m_FristName = m_FristName;
    }

    public void secondName(String m_SecondName) {
        this.m_SecondName = m_SecondName;
    }

    public void address(String m_Address) {
        this.m_Address = m_Address;
    }

    public void cellPhone(String m_CellPhone) {
        this.m_CellPhone = m_CellPhone;
    }

    public void email(String m_Email) {
        this.m_Email = m_Email;
    }

    public void sex(String m_Sex) {
        this.m_Sex = m_Sex;
    }

    public void type(String m_Type) {
        this.m_Type = m_Type;
    }

    public void isBlocked(Boolean m_IsBlocked) {
        this.m_IsBlocked = m_IsBlocked;
    }
    // END of Setters
    
    
    
    
    
    
}

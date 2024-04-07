/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pc
 */
public class AccountModel {
    private int id;
    private String fullName;
    private String userName;
    private String password;
    private String role;
    private int status;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AccountModel(String fullName, String userName, String password, String role, int status, String email) {
        //this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.status = status;
        this.email = email;
    }
    public AccountModel(String fullName, String userName, String password, String role, int status, String email, int id) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.status = status;
        this.email = email;
    }

    @Override
    public String toString() {
        return "AccountModel{" + "id=" + id + ", fullName=" + fullName + ", userName=" + userName + ", password=" + password + ", role=" + role + ", status=" + status + ", email=" + email + '}';
    }
    
    
    
    
}

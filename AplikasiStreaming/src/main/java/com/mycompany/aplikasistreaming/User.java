/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming;

/**
 *
 * @author Faiz
 */
public class User {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming;

import java.util.ArrayList;

/**
 *
 * @author Faiz
 */
import java.util.ArrayList;

public abstract class User implements InterfaceUser {
    private String userID;
    private String username;
    private String password;
    private String email;

    // Constructor
    public User(String userID, String username, String password, String email) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getters and Setters
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Implement login and logout from interface
    @Override
    public void login(String inputUsername, String inputPassword) {
        if (this.username.equals(inputUsername) && this.password.equals(inputPassword)) {
            System.out.println(username + " has successfully logged in.");
        } else {
            System.out.println("Invalid credentials for username: " + inputUsername);
        }
    }

    @Override
    public void logout() {
        System.out.println(username + " has logged out.");
    }

    // Abstract method for browsing catalog
    @Override
    public abstract void browseCatalog(ArrayList<String> catalog);

    @Override
    public String toString() {
        return "User [userID=" + userID + ", username=" + username + ", email=" + email + "]";
    }
}


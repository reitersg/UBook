/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Thomas Erlendson
 * @version 1.0
 */
public class User {
    private String username;
    private boolean admin;
    private String email;
    private String university;
    
    /**
     * Initialize a User object
     * @param username The user's username
     * @param admin If the user is an admin or not
     * @param email The user's email
     * @param university The user's university
     */
    public User(String username, boolean admin, String email, String university) {
        this.username = username;
        this.admin = admin;
        this.email = email;
        this.university = university;
    }

    /**
     * Get the user's username.
     * @return The user's username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Get the user's admin privileges.
     * @return If the user is an admin or not
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Get the user's email.
     * @return The user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Get the user's university.
     * @return The user's university
     */
    public String getUniversity() {
        return university;
    }
}

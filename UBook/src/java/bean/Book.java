/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Random;
import java.util.UUID;

/**
 *
 * @author reitersg
 */
public class Book {

    //Random rnd = new Random();
    private String userName;
    private int bookID;
    private String ISBN;

    public Book(String userName, int bookID, String ISBN2, String condition, String bookDescription, double price, int negotiable) {
        this.setUserName(userName);
        this.setNegotiable(negotiable);
        this.setISBN(ISBN2);
        this.setPrice(price);
        this.setCondition(condition);
        this.setBookID(bookID);
        this.setBookDescription(bookDescription);
    }
    
    public Book(String userName, String ISBN, String condition, String bookDescription, double price, int negotiable)
    {
        
        this.setUserName(userName);
        this.setNegotiable(negotiable);
        this.setISBN(ISBN);
        this.setPrice(price);
        this.setCondition(condition);
        this.setBookID(bookID);
        this.setBookDescription(bookDescription);        
    }

    public Book() {

    }
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBookID() {
        return bookID;
    }
    
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int isNegotiable() {
        return this.negotiable;
    }

    public void setNegotiable(int negotiable) {
           this.negotiable = negotiable;
    }
    private String condition;
    private String bookDescription;
    private double price;
    private int negotiable;

}

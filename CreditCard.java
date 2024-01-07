/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerceapp;

/**
 *
 * @author EnisBugra
 */
public class CreditCard {
    
    private String cardNumber;
    private User cardUser;
    private String securityCode;
    private String expirationDate;
    
    public CreditCard(String cardNumber , User cardUser , String securityCode , String expirationDate){
        this.cardNumber = cardNumber;
        this.cardUser = cardUser;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
    }
    
    public String getCardNumber(){
        return this.cardNumber;
    }
    
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    
    public User getCardUser(){
        return this.cardUser;
    }
    
    public void setCardUser(User cardUser){
        this.cardUser = cardUser;
    }
    
    public String getSecurityCode(){
        return this.securityCode;
    }
    
    public void setSecurityCode(String securityCode){
        this.securityCode = securityCode;
    }
    
    public String getExpirationDate(){
        return this.expirationDate;
    }
    
    public void setExpirationDate(String expirationDate){
        this.expirationDate = expirationDate;
    }
    
}

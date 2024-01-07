/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerceapp;

import java.util.ArrayList;

/**
 *
 * @author EnisBugra
 */
public class Order {
    private User customer;
    private Product orderedProduct;
    private CreditCard paymentCard;    
    
    public Order(User customer , Product orderedProduct , CreditCard paymentCard){
        this.customer = customer;
        this.orderedProduct = orderedProduct;
        this.paymentCard = paymentCard;
    }
    
    public User getCustomer(){
        return this.customer;
    }
    
    public void setCustomer(User customer){
        this.customer = customer;
    }
    
    public Product getOrderedProduct(){
        return this.orderedProduct;
    }
    
    public void setOrderedProduct(Product orderedProduct){
        this.orderedProduct = orderedProduct;
    }
    
    public CreditCard getPaymentCard(){
        return this.paymentCard;
    }
    
    public void setPaymentCard(CreditCard paymentCard){
        this.paymentCard = paymentCard;
    }
    
    public void completePurchase(int howMany){
        if (this.orderedProduct.stockControl(howMany)) {
            this.customer.purchase(this.orderedProduct, howMany , this.paymentCard);
        }
        else {
            System.out.println("Please reduce the amount of product and try again ! ");
        }
    }
}

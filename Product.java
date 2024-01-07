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
public class Product {

    private String productName;
    private String productColour;
    private String productCategory;
    private int productStock;
    private int productPrice;
    private String productWeight;
    private String productDescription;

    public Product(String productName, String productColour, String productCaregory, int productStock, int productPrice , String productWeight, String productDescription) {
        this.productName = productName;
        this.productColour = productColour;
        this.productCategory = productCategory;
        this.productStock = productStock;
        this.productPrice = productPrice;
        this.productWeight = productWeight;
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName){
        this.productName = productName;
    }
    
    public String getProductColour(){
        return this.productColour;
    }
    
    public void setProductColour(String productColour){
        this.productColour = productColour;
    }
    
    public String getProductCategory(){
        return this.productCategory;
    }
    
    public void setProductCategory(String productCategory){
        this.productCategory = productCategory;
    }

    public int getProductStock() {
        return this.productStock;
    }
    
    public void setProductStock(int productStock){
        this.productStock = productStock;
    }
    
    public int getProductPrice(){
        return this.productPrice;
    }
    
    public void setProductPrice(int productPrice){
        this.productPrice = productPrice;
    }
    
    public String getProductWeight(){
        return this.productWeight;
    }
    
    public void setProductWeight(String productWeight){
        this.productWeight = productWeight;
    }
    
    public String getProductDescription(){
        return this.productDescription;
    }
    
    public void setProductDescription(String productDescription){
        this.productDescription = productDescription;
    }
    
    public boolean stockControl(int howManyOrdered) {
        if (this.productStock >= howManyOrdered) {
            this.productStock = productStock - howManyOrdered;
            return true;
        } else {
            System.out.println("There are only " + this.productStock + " products in stock !");
            return false;
        }
    }
    
    
}

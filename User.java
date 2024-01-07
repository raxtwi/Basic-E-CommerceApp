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
public class User {

    private String username;
    private String password;
    private String name;
    private String surname;
    private String birthDay;
    private String email;
    private String homeAddress;
    private String workAddress;
    private ArrayList<Product> productsOrdered = new ArrayList<>();
    private ArrayList<Product> productsFavorite = new ArrayList<>();
    private ArrayList<CreditCard> creditCards = new ArrayList<>();
    private int amountOfFavoriteProducts;
    private int amountOfPurchasedProducts;
    private int amountOfCreditCards;

    public User(String username, String password, String name, String surname, String birthDay, String email, String homeAddress, String workAddress) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.email = email;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        
    }

    public void seeUserDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Surname : " + this.surname);
        System.out.println("userName : " + this.username);
        System.out.println("password : " + this.password);
        System.out.println("birthDay : " + this.birthDay);
        System.out.println("email : " + this.email);
        System.out.println("home address : " + this.homeAddress);
        System.out.println("work address : " + this.workAddress);

    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return this.homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return this.workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public void addCreditCard(CreditCard creditcard) {
        this.creditCards.add(creditcard);
        System.out.println("The new CreditCard " + "added " + this.name + "'s CreditCardList succesfully !");
        amountOfCreditCards++;
    }

    public void addFavoriteProduct(Product product) {
        this.productsFavorite.add(product);
        amountOfFavoriteProducts++;
        System.out.println("You " + this.name + " added " + product.getProductName() + " to your FavoriteProductList successfully !");
    }

    public void seeFavoriteProducts() {
        System.out.println("The list of your favorite product(s) : ");
        for (int i = 0; i < amountOfFavoriteProducts; i++) {
            System.out.println(this.productsFavorite.get(i).getProductName());
        }
    }

    
    
    public void purchase(Product product , int howMany , CreditCard creditcard){
        for (int i = 0; i <= amountOfCreditCards; i++) {
                if (i == amountOfCreditCards) {
                    System.out.println("Please add your CreditCard to your CreditCardList before purchasing !");
                    product.setProductStock(product.getProductStock()+howMany);
                } 
                else {
                    if (this.creditCards.get(i).getCardNumber().equals(creditcard.getCardNumber())) {
                        this.productsOrdered.add(product);
                        System.out.println("Purchasing is succesfull ! " + product.getProductName() + " have been added your OrderedList.");
                        System.out.println("Here the all details : ");
                        System.out.println("Ordered by : " + this.name + " " + this.surname);
                        System.out.println("Ordered Product(s) : " + product.getProductDescription());
                        System.out.println("How many product(s) ordered : " + howMany);
                        System.out.println("CreditCard user name : " + creditcard.getCardUser().name + " " + creditcard.getCardUser().surname);
                        System.out.println("CreditCard number that used : " + creditcard.getCardNumber());
                        System.out.println("Address : " + this.homeAddress);
                        System.out.println("Total Payment Amount : " + (howMany*product.getProductPrice()) + " TL");  
                        amountOfPurchasedProducts++;    
                        break;

                    }
                }
            }
        
    }

    public void seePurchasedProducts() {
        for (int i = 0; i < amountOfPurchasedProducts; i++) {
            System.out.println(this.productsOrdered.get(i).getProductName());
        }
    }

}

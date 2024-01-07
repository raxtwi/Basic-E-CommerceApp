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
public class ECommerceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        User user1 = new User("enis123" , "12345" , "Enis" , "BULUT" , "01.01.01" , "enis@gmail.com" , "Karabaglar-İzmir" , "Üçyol-İzmir"); 
        user1.seeUserDetails();
        
        System.out.println("========================");
        
        User user2 = new User("bugra123" , "12345" , "Buğra" , "BULUT" , "01.01.01" , "bugra@gmail.com" , "Karabaglar-İzmir" , "Üçyol-İzmir");
        user2.seeUserDetails();
        
        Product product1 = new Product("Iphone X" , "White" , "Technology/Phones" , 100 , 11000 , "174 gr." , "IphoneX , 64gb memory, 3gb RAM , 18 megapixel camera , white , 11.000 TL");         
        Product product2 = new Product("Monster Abra" , "Black" , "Technology/Laptops" , 100 , 10000 , "1500 gr." , "Monster ABRA , 50gb SSD , 16gb RAM , GTX 1650TI 4gb VRAM , 10.000 TL");
        
        CreditCard creditcard1 = new CreditCard("1234567890" , user1 , "123" , "01/21");
        
        Order order1 = new Order(user1 , product1 , creditcard1);
        Order order2 = new Order(user2 , product1 , creditcard1);
        
        System.out.println("========================");
        
        user1.addFavoriteProduct(product1);
                
        System.out.println("========================");
        
        user1.addCreditCard(creditcard1);
        
        System.out.println("========================");
        
        user1.seeFavoriteProducts();
        
        user1.seePurchasedProducts();
        
        System.out.println("========================");
        
        order1.completePurchase(50);
        
        System.out.println("========================");
        
        order2.completePurchase(40);
        
        System.out.println("========================");
        
        user2.addCreditCard(creditcard1);
        
        System.out.println("========================");
        
        order2.completePurchase(30);
        
        System.out.println("========================");        
        
        System.out.println(product1.getProductStock());
        
        System.out.println("========================");
        
        user1.seePurchasedProducts();
        
        System.out.println("========================");
        
        Order order3 = new Order(user1 , product2 , creditcard1);
        
        order3.completePurchase(1);
        
        System.out.println("========================");
        
        user1.seePurchasedProducts();
        
        System.out.println("========================");
        
        CreditCard creditcard2 = new CreditCard("0987654321" , user2 , "321" , "01/21");
        
        Order order4 = new Order(user2 , product2 , creditcard2);
        
        order4.completePurchase(5);
        
        System.out.println("=======================");
        
        user2.addCreditCard(creditcard2);
        
        System.out.println("=======================");
        
        order4.completePurchase(5);
        
        System.out.println("=======================");
        
        Order order5 = new Order(user1 , product2 , creditcard2);
        
        order5.completePurchase(1);
        
        System.out.println("=======================");
        
        user1.addCreditCard(creditcard2);
        
        System.out.println("=======================");        
        
        order5.completePurchase(500);
        
        System.out.println("=======================");
        
        order5.completePurchase(20);
        
        System.out.println("=======================");
        
        System.out.println(product2.getProductStock());
        
        
        
        
    }
    
}

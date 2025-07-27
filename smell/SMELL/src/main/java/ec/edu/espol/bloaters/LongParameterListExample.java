/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.bloaters;

/**
 *
 * @author Shirley Aragon
 */
public class LongParameterListExample {
    // Demasiados parámetros hacen que el método sea difícil de usar.

public class OrderProcessor {
    public void process(String productId, String userId, String shippingAddress,
                        String billingAddress, boolean applyDiscount, double taxRate) {
        // ...
    }
}
}

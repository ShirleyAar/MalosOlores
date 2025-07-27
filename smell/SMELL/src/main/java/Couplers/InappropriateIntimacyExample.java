/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couplers;

/**
 *
 * @author Shirley Aragon
 */
public class InappropriateIntimacyExample {
    // Una clase accede a detalles privados de otra clase de forma inapropiada.

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }
}

public class Auditor {
    public void audit(BankAccount account) {
        double b = account.getBalance(); // Está muy acoplado a los detalles internos
    }
}
}

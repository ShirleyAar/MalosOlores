/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.bloaters;

/**
 *
 * @author Shirley Aragon
 */
public class PrimitiveObsessionExample {
    // Uso innecesario de tipos primitivos en lugar de objetos con significado.

public class User {
    private String phoneNumber; 

    public boolean isEcuadorianNumber() {
        return phoneNumber.startsWith("+593");
    }
}
}

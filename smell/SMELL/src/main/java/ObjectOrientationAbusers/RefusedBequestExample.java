/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOrientationAbusers;

/**
 *
 * @author Shirley Aragon
 */
public class RefusedBequestExample {
    // Clase hija hereda métodos que no necesita o no debería usar.

public class Bird {
    public void fly() {
        System.out.println("Puedo volar");
    }
}

public class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Las avestruces no vuelan");
    }
}
    
}

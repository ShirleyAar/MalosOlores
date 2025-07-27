/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dispensables;

/**
 *
 * @author Shirley Aragon
 */
public class DuplicateCodeExample {
    // Código repetido en varios lugares, debería extraerse a un solo método.

public class Invoice {
    public void printHeader() {
        System.out.println("Empresa XYZ");
        System.out.println("Fecha: Hoy");
    }

    public void printFooter() {
        System.out.println("Empresa XYZ");
        System.out.println("Fecha: Hoy");
    }
}
}

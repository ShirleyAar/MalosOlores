/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangePreventers;

/**
 *
 * @author Shirley Aragon
 */
public class ShotgunSurgeryExample {
    // Cada vez que se crea una subclase en una jerarquía, se debe crear otra en otra jerarquía.

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Dibujando círculo");
    }
}

abstract class ShapeEditor {
    public abstract void edit();
}

class CircleEditor extends ShapeEditor {
    public void edit() {
        System.out.println("Editando círculo");
    }
}

}

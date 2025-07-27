/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couplers;

/**
 *
 * @author Shirley Aragon
 */
public class IncompleteLibraryClassExample {
    // Usamos una clase de librería que no cubre nuestras necesidades,
// y en lugar de extenderla o encapsularla, duplicamos comportamiento.

public class StringUtils {
    public static String capitalizeFirst(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
}

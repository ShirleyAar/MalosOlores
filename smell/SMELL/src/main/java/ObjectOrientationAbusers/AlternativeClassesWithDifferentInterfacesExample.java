/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOrientationAbusers;

/**
 *
 * @author Shirley Aragon
 */
public class AlternativeClassesWithDifferentInterfacesExample {
    // Clases similares con interfaces diferentes dificultan la reutilización.

public class SmsService {
    public void sendSms(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}

public class EmailService {
    public void enviarCorreo(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOrientationAbusers;

/**
 *
 * @author Llluvia Aragon
 */
public class SwitchStatementsExample {
    // El uso excesivo de switch puede romper el principio de OCP.

public class PaymentProcessor {
    public void process(String type) {
        switch (type) {
            case "paypal":
                System.out.println("Procesando pago con PayPal");
                break;
            case "card":
                System.out.println("Procesando pago con tarjeta");
                break;
            case "crypto":
                System.out.println("Procesando pago con cripto");
                break;
        }
    }
}

}

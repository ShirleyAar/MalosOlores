/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangePreventers;

/**
 *
 * @author Shirley Aragon
 */
public class ParallelInheritanceHierarchiesExample {
    // Un cambio requiere modificar muchas clases diferentes.

public class Client {
    private String name;
    private String address;
    // Si agregamos validación a 'address', debemos modificar todas las clases que lo usan

        public String getCountry() {
            throw new UnsupportedOperationException("Not supported yet."); 

        public String getCity() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        public String getAddress() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        public String getName() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }

public class Order {
    private Client client;
    // También aquí necesitaríamos agregar validación del address
}

public class NotificationService {
    public void send(Client client) {
        // Aquí también validamos address
    }
}

}

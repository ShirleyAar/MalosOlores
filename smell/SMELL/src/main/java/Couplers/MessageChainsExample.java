/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couplers;

/**
 *
 * @author Shirley Aragon
 */
public class MessageChainsExample {
    // Accedemos a una cadena de objetos, lo que rompe la ley de Demeter.

public class Order {
    private Client client;
    public Client getClient() { return client; }
}

public class Client {
    private Address address;
    public Address getAddress() { return address; }
}

public class Address {
    private String city;
    public String getCity() { return city; }
}

// En otro lado del código:
String city = order.getClient().getAddress().getCity(); 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couplers;

import ChangePreventers.ParallelInheritanceHierarchiesExample.Client;

/**
 *
 * @author Shirley Aragon
 */
public class FeatureEnvyExample {
    // Esta clase está demasiado interesada en los datos de otra clase.

public class InvoicePrinter {
    public void printInvoice(Client client) {
        System.out.println("Cliente: " + client.getName());
        System.out.println("Dirección: " + client.getAddress());
        System.out.println("Ciudad: " + client.getCity());
        System.out.println("País: " + client.getCountry());
    }
}

}

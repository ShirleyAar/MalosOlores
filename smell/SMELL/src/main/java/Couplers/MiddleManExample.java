/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couplers;

/**
 *
 * @author Shirley Aragon
 */
public class MiddleManExample {
    // Esta clase solo delega métodos y no aporta lógica real.

public class UserService {
    private Database database = new Database();

    public void save(User user) {
        database.save(user); // Solo delega
    }

    public User findById(int id) {
        return database.findById(id); // Solo delega
    }
}

}

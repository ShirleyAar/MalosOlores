/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOrientationAbusers;

/**
 *
 * @author Llluvia Aragon
 */
public class TemporaryFieldExample {
    // Campo que solo se usa en ciertos métodos. Es mejor evitarlo si no es permanente.

public class Report {
    private String temporaryNote;

    public void generate() {
        if (temporaryNote != null) {
            System.out.println("Nota: " + temporaryNote);
        }
        System.out.println("Generando informe...");
    }

    public void setTemporaryNote(String note) {
        this.temporaryNote = note;
    }
}

}

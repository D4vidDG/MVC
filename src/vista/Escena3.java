/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author Estudiante
 */
public class Escena3 {
    private Scene escena;
    private Button btVolver;
    

    public Button getBtVolver() {
        return btVolver;
    }

    public Escena3() {
       
        this.btVolver=new Button("Volver");
        
        this.escena=new Scene(btVolver,500,500);
    }

    public Scene getScene() {
       return this.escena;
    }
    
}

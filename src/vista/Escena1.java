/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Estudiante
 */
public class Escena1 
        implements Vista {
    private Scene escena;
    private Label lbNombre;
    private TextField tfNombre;
    private Label lbApellido;
    private TextField tfApellido;
    private Button bSiguiente;

    public TextField getTfNombre() {
        return tfNombre;
    }

    public TextField getTfApellido() {
        return tfApellido;
    }

    public Button getbSiguiente() {
        return bSiguiente;
    }
    
    
    public Escena1() {
       this.lbNombre = 
               new Label("Nombre");
       this.lbApellido = 
               new Label("Apellido");
       this.tfNombre = new TextField();
       this.tfApellido = new TextField();
       this.bSiguiente = new Button("Siguiente");
       VBox layout  = new VBox();
       HBox fila1 = new HBox();
       HBox fila2 = new HBox(); 
       fila1.getChildren().add(lbNombre);
       fila1.getChildren().add(tfNombre);
       fila2.getChildren().add(lbApellido);
       fila2.getChildren().add(tfApellido);
       layout.getChildren().add(fila1);
       layout.getChildren().add(fila2);
       layout.getChildren().add(bSiguiente);
       this.escena = new Scene(layout, 500, 500);
    }
    
    @Override
    public Scene getScene() {
       return this.escena;     
    }
    
}

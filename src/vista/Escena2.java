/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Estudiante
 */
public class Escena2 implements Vista{
    private Scene escena;
    private Label lbEdad;
    private TextField tfEdad;
    private Label lbEstudio;
    private RadioButton rbBachillerato;
    private RadioButton rbPregrado;
    private RadioButton rbPosgrado;
    private Button btGuardar;
    private ToggleGroup grupo;

    public TextField getTfEdad() {
        return tfEdad;
    }

    public RadioButton getRbBachillerato() {
        return rbBachillerato;
    }

    public RadioButton getRbPregrado() {
        return rbPregrado;
    }

    public Button getBtGuardar() {
        return btGuardar;
    }

    public Escena2(Scene escena) {
        this.escena = escena;
    }

    public RadioButton getRbPosgrado() {
        return rbPosgrado;
    }
    
    
    
    public Escena2() {
      this.lbEdad = new Label("Edad");
      this.tfEdad = new TextField();
      this.lbEstudio = new Label("Estudio");
      grupo = new ToggleGroup();
      this.rbBachillerato = 
              new RadioButton("Bachillerato");
      this.rbBachillerato.setToggleGroup(grupo);
     this.rbPregrado = 
             new RadioButton("Pregrado");
     this.rbPregrado.setToggleGroup(grupo);
     this.rbPosgrado = 
             new RadioButton("PosGrado");
     this.rbPosgrado.setToggleGroup(grupo);
     this.btGuardar = new Button("Guardar");
     VBox layout = new VBox();
     HBox fila1 = new HBox();
     HBox fila2 = new HBox();
     VBox columna1 = new VBox();
     columna1.getChildren().add(rbBachillerato);
     columna1.getChildren().add(rbPregrado);
     columna1.getChildren().add(rbPosgrado);
     fila1.getChildren().add(lbEdad);
     fila1.getChildren().add(tfEdad);
     fila2.getChildren().add(lbEstudio);
     fila2.getChildren().add(columna1);
     layout.getChildren().add(fila1);
     layout.getChildren().add(fila2);
     layout.getChildren().add(btGuardar);
     this.escena = 
             new Scene(layout, 500, 500);
             
      
    }
    
    @Override
    public Scene getScene() {
        return this.escena;
    }
    
}

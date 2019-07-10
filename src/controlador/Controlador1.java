/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Dao;
import modelo.Estudiante;
import vista.Escena1;
import vista.Escena2;

/**
 *
 * @author Estudiante
 */
public class Controlador1 {
    private Escena1 escena;
    

    public Escena1 getEscena() {
        return escena;
    }
    
    public Controlador1() {
      this.escena = 
              new Escena1();
      this.escena.getbSiguiente()
                .setOnAction(new Evento());
    }
    
    private class Evento 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
           String nombre=escena.getTfNombre().getText();
           String apellido=escena.getTfApellido().getText();

                   Singleton singleton=
                   Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Escena2 escena = new Escena2();
           stage.setScene( escena.getScene());
           stage.show();

          Controlador2 controlador = new 
               Controlador2(nombre,apellido);
           Scene scene =controlador.getVista().getScene();
                 
           stage.setTitle("Escena 2");
           stage.setScene(scene);
           stage.show();
        }
    }
    
    
    
    
}

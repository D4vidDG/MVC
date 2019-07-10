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
import vista.Escena3;

/**
 *
 * @author Estudiante
 */
public class Controlador3 {
    private Escena3 vista;
    private Dao modelo;

    public Escena3 getVista() {
        return vista;
    }

    public Controlador3() {
        this.vista=new Escena3();
        this.vista.getBtVolver().setOnAction(new Evento());
    }
        private class Evento 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
           Singleton singleton=
                   Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controlador1 controlador = new 
               Controlador1();
           Scene scene =controlador.getEscena().getScene();
           stage.setTitle("Escena 1");
           stage.setScene(scene);
           stage.show();
        }
    }
    
}

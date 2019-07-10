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
import modelo.ArchivoDao;
import modelo.Dao;
import modelo.Estudiante;
import vista.Escena1;
import vista.Escena2;

/**
 *
 * @author Estudiante
 */
public class Controlador2 {
    private Escena2 vista;
    private Dao modelo;
    private String nombre;
    private String apellido;

   

    public Escena2 getVista() {
        return vista;
    }
    

    public Controlador2(String nombre,String apellido) {
        this.vista=new Escena2();
        this.vista.getBtGuardar().setOnAction(new Evento());
        this.nombre=nombre;
        this.apellido=apellido;
        this.modelo=new ArchivoDao("estudiantes.txt");
    }
        private class Evento 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
            boolean bachiller=vista.getRbBachillerato().isSelected();
            boolean pregrado=vista.getRbPregrado().isSelected();
            boolean posgrado=vista.getRbPosgrado().isSelected();
            String estudio=null;
            String edad=vista.getTfEdad().getText();
            if(bachiller){
                estudio="Bachillerato";
            }if(pregrado){
                estudio="Pregrado";
            }if(posgrado){
                estudio="Posgrado";
            }
            Estudiante estudiante=new Estudiante(nombre,apellido,edad,estudio);
            modelo.guardar(estudiante);
           Singleton singleton=
                   Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controlador3 controlador = new 
               Controlador3();
           Scene scene =controlador.getVista().getScene();
                 
           stage.setTitle("Escena 3");
           stage.setScene(scene);
           stage.show();
        }
    }
    
    
}

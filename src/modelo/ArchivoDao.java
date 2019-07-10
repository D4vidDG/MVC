/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class ArchivoDao implements Dao{
    private String ruta;

    public ArchivoDao(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public boolean guardar(Estudiante estudiante) {
    
    }

    @Override
    public ArrayList<Estudiante> leer() {
        
    }
    
}

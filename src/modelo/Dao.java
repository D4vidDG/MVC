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
public interface  Dao {
    public boolean guardar(Estudiante estudiante);
    public ArrayList<Estudiante> leer();
}

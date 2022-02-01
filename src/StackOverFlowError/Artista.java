/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackOverFlowError;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nahue
 */
public class Artista {
    private String nombre;
    private List<Cancion> canciones;

    
    public Artista() {
        this.canciones = new ArrayList<>();
    }
    
    public Artista(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }
    
    public Artista(String nombre, List<Cancion> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Artista: " + nombre + ", canciones=" + canciones;
//        return "Artista: " + nombre ;
    }

   
    
    
}

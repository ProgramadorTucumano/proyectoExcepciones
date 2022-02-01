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
public class BaseDeDatos {
    List<Artista> artistasAlmacenados; 
    List<Cancion> cancionesAlmacenadas; 

    public BaseDeDatos() {
        artistasAlmacenados = new ArrayList<>();
        cancionesAlmacenadas = new ArrayList<>();
    }

    public List<Artista> getArtistasAlmacenados() {
        return artistasAlmacenados;
    }

    public void setArtistasAlmacenados(List<Artista> artistasAlmacenados) {
        this.artistasAlmacenados = artistasAlmacenados;
    }

    public List<Cancion> getCancionesAlmacenadas() {
        return cancionesAlmacenadas;
    }

    public void setCancionesAlmacenadas(List<Cancion> cancionesAlmecandas) {
        this.cancionesAlmacenadas = cancionesAlmecandas;
    }

    @Override
    public String toString() {
        return "BaseDeDatos{" + "artistasAlmacenados=" + artistasAlmacenados + ", cancionesAlmecandas=" + cancionesAlmacenadas + '}';
    }
    
}

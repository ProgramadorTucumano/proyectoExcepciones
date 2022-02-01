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
public class ArtistaService {
    
    private BaseDeDatosServicio baseDeDatosServicio = new BaseDeDatosServicio();
    
    public List<Cancion> traerCancionesDelArtista(BaseDeDatos baseDeDatos, Artista artista) {
        List<Cancion> canciones = baseDeDatos.getCancionesAlmacenadas();
        List<Cancion> cancionesDelArtista = new ArrayList<>();
        for (Cancion cancion : canciones) {
            if (cancion.getAutor().equals(artista)) {
                cancionesDelArtista.add(cancion);
            }
        }
        return cancionesDelArtista;
    }
    
}

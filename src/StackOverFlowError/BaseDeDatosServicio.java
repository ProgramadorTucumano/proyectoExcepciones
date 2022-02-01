/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackOverFlowError;

import java.util.List;

/**
 *
 * @author Nahue
 */
public class BaseDeDatosServicio {
    
    public Artista guardarArtista(BaseDeDatos baseDeDatos ,Artista artista) {
        baseDeDatos.getArtistasAlmacenados().add(artista);
        return artista;
    }
    public Cancion guardarCancion(BaseDeDatos baseDeDatos ,Cancion cancion) {
        baseDeDatos.getCancionesAlmacenadas().add(cancion);
        return cancion;
    }
}

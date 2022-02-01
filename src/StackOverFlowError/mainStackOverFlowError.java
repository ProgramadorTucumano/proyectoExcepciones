/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackOverFlowError;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Nahue
 */
public class mainStackOverFlowError {
    
    public static void main(String[] args) {
          imprimirNumero(4);
    }
    
    public static int imprimirNumero(int numero) {
  
        numero = numero + 2;
        return imprimirNumero(numero);
    }
    
    
//    public static void main(String[] args) {
//        Artista artista1 = new Artista("Jeremias");
//        Cancion cancion1 = new Cancion("Viva la vida", artista1);
//        artista1.getCanciones().add(cancion1);
//        System.out.println("Artista: "+artista1);
    
    
//        BaseDeDatos baseDeDatos = new BaseDeDatos();
//        BaseDeDatosServicio datosServicio = new BaseDeDatosServicio();
//        ArtistaService artistaService = new ArtistaService();
//        
//        Artista artista1 = new Artista("Jeremias");
//        datosServicio.guardarArtista(baseDeDatos, artista1);
//        Cancion cancion1 = new Cancion("Viva la vida", artista1);
//        datosServicio.guardarCancion(baseDeDatos, cancion1);
//        Cancion cancion2 = new Cancion("Que lindo curso", artista1);
//        datosServicio.guardarCancion(baseDeDatos, cancion2);
//        Cancion cancion3 = new Cancion("azuquita", artista1);
//        datosServicio.guardarCancion(baseDeDatos, cancion3);
//        Artista artistaB = new Artista("Tobias");
//        datosServicio.guardarArtista(baseDeDatos, artistaB);
//        Cancion cancionA = new Cancion("LA macarena", artistaB);
//        datosServicio.guardarCancion(baseDeDatos, cancionA);
//        Cancion cancionB = new Cancion("salsa", artistaB);
//        datosServicio.guardarCancion(baseDeDatos, cancionB);
//        Cancion cancionC = new Cancion("keloke", artistaB);
//        datosServicio.guardarCancion(baseDeDatos, cancionC);
//        
//        System.out.println(artistaService.traerCancionesDelArtista(baseDeDatos, artista1));     
        
//    }
    
    
}

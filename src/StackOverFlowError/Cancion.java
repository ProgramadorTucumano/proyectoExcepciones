/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackOverFlowError;

/**
 *
 * @author Nahue
 */
public class Cancion {
    private String Titulo;
    private Artista autor;

    public Cancion(String Titulo, Artista autor) {
        this.Titulo = Titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Artista getAutor() {
        return autor;
    }

    public void setAutor(Artista autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion: " + Titulo + ", autor=" + autor ;
    }
    
    
}

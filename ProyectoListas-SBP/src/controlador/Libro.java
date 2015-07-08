/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Zamuel
 */
public class Libro {
    
    public String codigoLibro;
    public String nombreLibro;
    public String editorial;
    public String autor;
    public String genero;

    public Libro(String codigoLibro, String nombreLibro, String editorial, String autor, String genero) {
        this.codigoLibro = codigoLibro;
        this.nombreLibro = nombreLibro;
        this.editorial = editorial;
        this.autor = autor;
        this.genero = genero;
    }
    
    Libro(){
    
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    

    @Override
    public String toString() {
        return "Código del Libro:  " + codigoLibro +" \n " + "Nombre del Libro:  "+nombreLibro+" \n " + "Editorial:  "+editorial+" \n " + "Autor:  "+autor+" \n " + "Género:  "+genero+ "\n" ;
    }
    
    
    
}

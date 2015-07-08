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
public class NodoLibro {
    public Libro dato;
    public NodoLibro siguiente;
    public int clave;
    public NodoLibro(Libro dato){
        this.dato=dato;
        siguiente=null;
    }

   public NodoLibro(Libro dato,int clave){
        this.dato=dato;
        this.clave=clave;
        siguiente=null;
    }
   public Object getDato() {
        return dato;
    }

    public void setDato(Libro dato) {
        this.dato = dato;
    }

    public NodoLibro getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLibro siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
}

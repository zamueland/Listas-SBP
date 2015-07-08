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
public class NodoPrestamos {
    public Prestamos dato;
    public NodoPrestamos siguiente;
    public int clave;
    public NodoPrestamos(Prestamos dato){
        this.dato=dato;
        siguiente=null;
    }
    public NodoPrestamos(Prestamos dato,int clave){
        this.dato=dato;
        this.clave=clave;
        siguiente=null;
    }
    public Object getDato() {
        return dato;
    }

    public void setDato(Prestamos dato) {
        this.dato = dato;
    }

    public NodoPrestamos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPrestamos siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
}

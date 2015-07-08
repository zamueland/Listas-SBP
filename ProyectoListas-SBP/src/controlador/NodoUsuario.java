/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**Li que no es visible esta en controlador y en modelo. 
 *
 * @author Zamuel con Z
 */

//Estructura del nodo, es decir los datos que tiene, campos del nodo de usuario
//
public class NodoUsuario {
    public Usuario dato;
    public NodoUsuario siguiente;
    
    //médoto constructor
    public int clave;
    public NodoUsuario(Usuario dato){
        this.dato=dato;
        siguiente=null;
    }
    //Método consnn
    public NodoUsuario(Usuario dato,int clave){
        this.dato=dato;
        this.clave=clave;
        siguiente=null;
    }
    
    
    //Get es recibe, set es muestra
    public Object getDato() {
        return dato;
    }

    public void setDato(Usuario dato) {
        this.dato = dato;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }

    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import controlador.Usuario;
import controlador.NodoUsuario;

/**
 *
 * @author Zamuel
 */
public class ListaUsuario {
    private NodoUsuario cabecera;
    private NodoUsuario aux;
    
    public boolean esVacia(){
        return (this.cabecera == null);
    }
    
    public int size(){
        int contador =0;
        if(! esVacia()){
              aux = cabecera;
             
        }
        while( aux != null){
            aux = aux.siguiente ;
            contador ++;
        }
        return contador;
    }
    
    public String print(){
        
       String a ="";
       NodoUsuario aux1 = cabecera;
        if(! esVacia()){
            while (aux1 != null){
                a = a+aux1.clave + "["+aux1.dato+"]" +"\n" ;
                aux1=aux1.siguiente;
                
            }
        
        }else{
            System.out.println("La lista esta vacia");
        }
        
        return a;
    }
    //aquí se hace la estructura lógica de cada acción, o el CRUD. 
    
    
    // DEsde aquí se inserta un nodo o usuarioyu. 
    public void insertarInicio(Usuario dato, int clave){
        NodoUsuario nuevo = new NodoUsuario(dato,clave);
        if(esVacia()){
            cabecera = nuevo;//cuando es vacia
        }
        else{//Si la clave es menor
            if(clave < cabecera.clave){
                nuevo.siguiente = cabecera;
                cabecera = nuevo;
            }else{//Si no
                NodoUsuario aux = cabecera;
                NodoUsuario anterior = cabecera;
                while(clave > aux.clave && aux.siguiente!=null){//recorrer
                    anterior = aux;
                    aux= aux.siguiente;
                }
                if(clave > aux.clave && aux.siguiente== null){
                    aux.siguiente = nuevo;
                }else{
                    if(clave!= aux.clave){//Entre nodos
                        nuevo.siguiente = aux;
                        anterior.siguiente = nuevo;
                    }
                }
            }
            
        }
        
    }
    
    //Se Empieza a eliminar, la LISTA, con todos los nodos,que hayan dentro. 
    public void eliminarLista(){
       if(! esVacia()){
           cabecera.siguiente = null;
           cabecera = null;
       } 
    }
    
    public void eliminarInicio(){
        if(! esVacia()){
            if(cabecera.siguiente != null)
                cabecera = cabecera.siguiente;
        }
    }
    
    public void eliminarFinal(){
        NodoUsuario aux = cabecera;
        while(aux.siguiente.siguiente!= null){
            aux = aux.siguiente;
        }
        aux.siguiente = null;
    }
    
    public void eliminarNodoClave(int clave){
        NodoUsuario aux =  cabecera;
        if (!esVacia()) {
            if (aux.siguiente==null&&cabecera.clave==clave) {
                eliminarLista();
            }else{
                if (aux.clave==clave) {
                    eliminarInicio();
                }else{
                    while (aux.siguiente!=null) {                        
                        if (aux.siguiente.clave==clave) {
                            NodoUsuario eliminar = aux.siguiente;
                            aux.siguiente = aux.siguiente.siguiente;
                            eliminar.siguiente=null;
                            break;
                        }
                        aux = aux.siguiente;
                    }
                }
            }
        }else{
            System.out.println("La lista esta vacía no se puede eliminar");
        }
    }
    
    public NodoUsuario buscar(int clave){
        NodoUsuario aux = cabecera;
        if(! esVacia())
            if(aux.clave == clave)
                return aux;
            while(aux.siguiente!= null){
                    if(aux.siguiente.clave == clave)
                        return aux.siguiente;
                    aux = aux.siguiente;
            }
          return null;
    }
    public NodoUsuario get(int posicion){
        NodoUsuario aux = cabecera;
        int contador=0;
        while(contador != posicion){
            aux = aux.siguiente;
            contador++;
        }
        return aux;
    }
    
     public void modificar(int clave, Usuario datoModificar){
        NodoUsuario aux = buscar(clave);
        if(aux != null){
            aux.dato = datoModificar;
        }
    }
     
     public NodoUsuario buscarDato(String ced){
        NodoUsuario aux = cabecera;
        if(! esVacia())
            if(aux.dato.getCedula().equals(ced))
                return aux;
            while(aux.siguiente!= null){
                    if(aux.siguiente.dato.getCedula().equals(ced))
                        return aux.siguiente;
                    aux = aux.siguiente;
            }
          return null;
    }
    
    
}

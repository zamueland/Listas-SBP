/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import controlador.Libro;
import controlador.NodoLibro;


/**
 *
 * @author Zamuel
 */
public class ListaLibro {
    private NodoLibro cabecera;
    private NodoLibro aux;
    
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
       NodoLibro aux1 = cabecera;
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
    public void insertarInicio(Libro dato, int clave){
        NodoLibro nuevo = new NodoLibro(dato,clave);
        if(esVacia()){
            cabecera = nuevo;//cuando esta vacia
        }
        else{//Si la clave es menor
            if(clave < cabecera.clave){
                nuevo.siguiente = cabecera;
                cabecera = nuevo;
            }else{//Si no
                NodoLibro aux = cabecera;
                NodoLibro anterior = cabecera;
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
        NodoLibro aux = cabecera;
        while(aux.siguiente.siguiente!= null){
            aux = aux.siguiente;
        }
        aux.siguiente = null;
    }
    
    public void eliminarNodoClave(int clave){
        NodoLibro aux =  cabecera;
        if (!esVacia()) {
            if (aux.siguiente==null&&cabecera.clave==clave) {
                eliminarLista();
            }else{
                if (aux.clave==clave) {
                    eliminarInicio();
                }else{
                    while (aux.siguiente!=null) {                        
                        if (aux.siguiente.clave==clave) {
                            NodoLibro eliminar = aux.siguiente;
                            aux.siguiente = aux.siguiente.siguiente;
                            eliminar.siguiente=null;
                            break;
                        }
                        aux = aux.siguiente;
                    }
                }
            }
        }else{
            System.out.println("La lista esta vacía, no se puede eliminar");
        }
    }
    
    public NodoLibro buscar(int clave){
        NodoLibro aux = cabecera;
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
    
    public NodoLibro get(int posicion){
        NodoLibro aux = cabecera;
        int contador=0;
        while(contador != posicion){
            aux = aux.siguiente;
            contador++;
        }
        return aux;
    }
    
    public void modificar (int clave,  Libro datoModificar){
        NodoLibro aux = buscar(clave);
        if(aux != null){
            aux.dato = datoModificar;
        }
    }
     
     public NodoLibro buscarDato(String NombreLibro){
        NodoLibro aux = cabecera;
        if(! esVacia())
            if(aux.dato.getNombreLibro().equals(NombreLibro))
                return aux;
            while(aux.siguiente != null){
                    if(aux.siguiente.dato.getNombreLibro().equals(NombreLibro))
                        return aux.siguiente;
                    aux = aux.siguiente;
            }
          return null;
    }
}
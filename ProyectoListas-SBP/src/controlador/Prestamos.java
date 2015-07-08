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
public class Prestamos {
    
    public String codigoPrestamo;
    public String codigoLibro;
    public String cedula;
    public String fechaSalida;
    public String fechaMaximaDevolucion;

    public Prestamos(String codigoPrestamo, String codigoLibro, String cedula, String fechaSalida, String fechaMaximaDevolucion) {
        this.codigoPrestamo = codigoPrestamo;
        this.codigoLibro = codigoLibro;
        this.cedula = cedula;
        this.fechaSalida = fechaSalida;
        this.fechaMaximaDevolucion = fechaMaximaDevolucion;
    }

    

    Prestamos (){
    
    }

    public String getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public void setCodigoPrestamo(String codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaMaximaDevolucion() {
        return fechaMaximaDevolucion;
    }

    public void setFechaMaximaDevolucion(String fechaMaximaDevolucion) {
        this.fechaMaximaDevolucion = fechaMaximaDevolucion;
    }
    
    
    @Override
    public String toString() {
        return "Código del Préstamo:  " + codigoPrestamo +" \n " + "Código del Libro:  "+codigoLibro+" \n " + "Cédula:  "+cedula+" \n " + "Fecha de Salida:  "+fechaSalida+" \n " + "Fecha Máxima de Devolución:  "+fechaMaximaDevolucion+ "\n" ;
    }
    
    
    
    
}

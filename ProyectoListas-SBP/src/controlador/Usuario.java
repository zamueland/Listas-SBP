/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
/**
 *
 * @author Melissa
 */


//Aquí es donde se definen las variables que se van a utilizasr en el formulario de los usuarios 
public class Usuario {

    
    //Declaración de variables
    public String cedula;
    public String apellido;
    public String nombres;
    public String fechaNacimiento;
    public String telefono;
    public String celular;
    public String correoElectronico;
    public String perfil;
    public String contraseña;
    public String confirmarContraseña;

    //Por ejemplo THIS es a este campo cedula, llevele el campo cedula. 

    

    public Usuario(String cedula, String apellido, String nombres, String fechaNacimiento, String telefono, String celular, String correoElectronico, String perfil, String contraseña, String confirmarContraseña) {
        this.cedula = cedula; 
        this.apellido = apellido;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.perfil = perfil;
        this.contraseña = contraseña;
        this.confirmarContraseña = confirmarContraseña;
    }
    
    
   
    Usuario() {
        
        //inicializa el formulaario o campos, los habilita para que funcionen. 
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getConfirmarContraseña() {
        return confirmarContraseña;
    }

    public void setConfirmarContraseña(String confirmarContraseña) {
        this.confirmarContraseña = confirmarContraseña;
    }

    
   

    @Override
    public String toString() {
        //Retorne estos valores al fomulario de las interfaces graficas, o vistas. 
        return "Cédula:  " + cedula +" \n " + "Apellidos:  "+apellido+" \n " + "Nombres:  "+nombres+" \n " + "Celular:  "+telefono+" \n " + "Perfil:  "+celular+ "\n" + "Correo Electronico:  "+perfil+" \n " + "Teléfono:  "+fechaNacimiento+" \n "+ "Fecha de Nacimieno:  "+correoElectronico+" \n "+ "Contraseña:  "+contraseña+" \n " ;
    }


    
    
    
}

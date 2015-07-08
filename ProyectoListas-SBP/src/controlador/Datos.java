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
public class Datos {
    public boolean validarUsuario(String user, String password){
        if (user.equals("samuel")&& password.equals("qwerty")){
             return true;
        } else {
             return false;
        }
    }
    
}

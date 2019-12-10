/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author roger
 */
@WebService(serviceName = "LoginWS")
public class LoginWS {

    
    
    /**
     * This is a sample web service operation
     
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    */
    
    /*
        Servicio web de login
    */
    @WebMethod(operationName = "mainLogin")
    public boolean loginCredentials(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasenia") String contrasenia){
        
        boolean result = true;
        
        if(usuario.isEmpty() && contrasenia.isEmpty()){
            result = false;
        }
        
        return result;
        
    }
    
}

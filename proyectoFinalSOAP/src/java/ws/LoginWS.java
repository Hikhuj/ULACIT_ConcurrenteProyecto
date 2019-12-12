/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import com.proyecto.dao.EmpleadoDAO;
import com.clasesprogramaejemplos.Empleado;
import com.clasesprogramaejemplos.SuperAdmin;
import com.clasesprogramaejemplos.VendedorA;
import com.clasesprogramaejemplos.VendedorB;
import java.util.List;

/**
 *
 * @author roger
 */
@WebService(serviceName = "LoginWS")
public class LoginWS {

    private static List<Empleado> listaEmpleado = EmpleadoDAO.getEmpleados();
    
    // DEPRECATE
    // Declarar e instanciar un objeto nuevo de tipo Empleado por ser la raiz de la clase (Parent)
    // Empleado empleado = new Empleado();
    
    /*
        Servicio web de login
    */
    @WebMethod(operationName = "mainLogin")
    public boolean loginCredentials(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasenia") String contrasenia){
        
        // Evaluar si usuario es valido o no.
        
        boolean result = false;
        
        for(Empleado e : listaEmpleado){
            if(e instanceof Empleado){
                // Empleado emp = (Empleado) e;
                if(e.getUsuario().equals(usuario) && e.getContrasenia().equals(contrasenia)){
                    result = true;
                    break;
                }
            }else if(e instanceof SuperAdmin){
                SuperAdmin emp = (SuperAdmin) e;
                if(emp.getUsuario().equals(usuario) && emp.getContrasenia().equals(contrasenia)){
                    result = true;
                    break;
                }
            }else if(e instanceof VendedorA){
                VendedorA emp = (VendedorA) e;
                if(emp.getUsuario().equals(usuario) && emp.getContrasenia().equals(contrasenia)){
                    result = true;
                    break;
                }
            }else if(e instanceof VendedorB){
                VendedorB emp = (VendedorB) e;
                if(emp.getUsuario().equals(usuario) && emp.getContrasenia().equals(contrasenia)){
                    result = true;
                    break;
                }
            }
        }
        
        return result;
        
    }
    
}
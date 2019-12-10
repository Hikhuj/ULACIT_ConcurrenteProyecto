/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.clasesprogramaejemplos.Admin;
import com.clasesprogramaejemplos.Empleado;
import com.clasesprogramaejemplos.SuperAdmin;
import com.clasesprogramaejemplos.VendedorA;
import com.clasesprogramaejemplos.VendedorB;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roger
 */
public class EmpleadoDAO {
    
    public static ArrayList<Empleado> empleadosTienda = new ArrayList<Empleado>();
    
    public static List<Empleado> getEmpleados(){
        
        // Crear diferentes objetos de EMPLEADO.
        empleadosTienda.add(new Empleado(1, "rogerUser", "password123", "Roger", "Jose", "Ulate", "Rivera", "roger@ulate.com"));
        empleadosTienda.add(new Admin(2, "userAdmin", "password123", "User", "Admin", "Umana", "Jimenez", "userAdmin@test.com", "Lunes a Jueves, 7 am a 4 pm"));
        empleadosTienda.add(new SuperAdmin(3, "userSuperAdmin", "password123", "Super", "Admin", "Johnson", "Araya", "userSuperAdmin@test.com", "Sede Central"));
        empleadosTienda.add(new VendedorA(4, "userVendedor1", "password123", "Juan", "Antonio", "Rosales", "", "juan@test.com", 25));
        empleadosTienda.add(new VendedorA(5, "userVendedor2", "password123", "Jose", "Ricardo", "Mendez", "Montero", "jose@test.com", 15));
        empleadosTienda.add(new VendedorA(6, "userVendedor3", "password123", "Maria", "Jimenez", "Ramirez", "Mendoza", "maria@test.com", 50));
        empleadosTienda.add(new VendedorB(7, "userVendedor4", "password123", "Eduardo", "Loria", "Gonzalez", "Viquez", "eduardo@test.com", 45));
        empleadosTienda.add(new Empleado(8, "userContador", "password123", "Graciela", "Ezztriva", "Morale", "Zapata", "graciea@test.com"));
        
        return empleadosTienda;
        
    }
    
}

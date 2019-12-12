/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.clasesprogramaejemplos.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roger
 */
public class ClienteDAO {
    
    public static ArrayList<Cliente> clientesTienda = new ArrayList<Cliente>();
    
    public static List<Cliente> getClientes(){
        
        // Crear diferentes objetos de CLIENTES.
        clientesTienda.add(new Cliente(1, "Roger", "Jose", "Ulate", "Rivera", "rulater530@ulacit.ed.cr"));
        clientesTienda.add(new Cliente(2, "Javier", "Jara", "Gonzales", "Bouterie", "cliente2@test.com"));
        clientesTienda.add(new Cliente(3, "Esteban", "Ulises", "Botero", "Solis", "cliente3@test.com"));
        clientesTienda.add(new Cliente(4, "Melissa", "Maitel", "Varieta", "Sozzccio", "cliente4@test.com"));
        
        return clientesTienda;
        
    }
    
}

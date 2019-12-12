/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.clasesprogramaejemplos.Proveedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roger
 */
public class ProveedorDAO {
    
    public static ArrayList<Proveedor> proveedorLista = new ArrayList<Proveedor>();
    
    public static List<Proveedor> getProveedor(){
        
        // Crear distintos objetos de PROVEEDORES
        proveedorLista.add(new Proveedor(0, "Sin Proveedor", "", "", "", "", "", "", 0));
        proveedorLista.add(new Proveedor(1, "Intel", "USA", "California", "Manfred", "Morales", "Zapata", "proveedor@intel.com", 22225050));
        proveedorLista.add(new Proveedor(2, "Microsoft Costa Rica", "Costa Rica", "Heredia", "Mariela", "Alpizar", "Solis", "proveedor@microsoftcr.com", 22223030));
        proveedorLista.add(new Proveedor(3, "Olebelisco Sistemas", "Costa Rica", "San Jose", "Leonardo", "Garnier", "Geningen", "proveedor@olebelisco.com", 22229090));
        proveedorLista.add(new Proveedor(4, "Monge", "Costa Rica", "San Jose", "Melissa", "Mora", "Esquivel", "proveedor@importadoraMonge.com", 25250505));
        
        return proveedorLista;
        
    }
    
}

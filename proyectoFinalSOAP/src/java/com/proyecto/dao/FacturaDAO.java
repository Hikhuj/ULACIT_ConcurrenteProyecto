/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.clasesprogramaejemplos.Factura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roger
 */
public class FacturaDAO {
    
    public static int listaProductosComprados[] = {2,3,1};
    public static int listaProductosComprados1[] = {1,3,1};
    public static int listaProductosComprados2[] = {4,9,7};
    public static int listaProductosComprados3[] = {1,2,3};
    public static int listaProductosComprados4[] = {6,7,9};
    
    public static ArrayList<Factura> facturaLista = new ArrayList<Factura>();
    
    public static List<Factura> getFacturas(){
        
        // Crear diferentes objetos de EMPLEADO.
        facturaLista.add(new Factura(1, 2, "cliente2@test.com", "Javier", "Jose", "12/12/2019", "13:00", 250000.00, 2500.00, 255000.00, listaProductosComprados));
        facturaLista.add(new Factura(1, 2, "cliente2@test.com", "Javier", "Jose", "10/12/2019", "13:00", 150000.00, 2500.00, 255000.00, listaProductosComprados1)); 
        facturaLista.add(new Factura(1, 2, "cliente2@test.com", "Javier", "Maria", "23/12/2019", "14:00", 350000.00, 1500.00, 355000.00, listaProductosComprados2));
        facturaLista.add(new Factura(1, 3, "cliente3@test.com", "Esteban", "Maria", "01/09/2019", "15:00", 450000.00, 3500.00, 455000.00, listaProductosComprados3));
        facturaLista.add(new Factura(1, 3, "cliente3@test.com", "Esteban", "Maria", "15/10/2019", "16:00", 550000.00, 5500.00, 555000.00, listaProductosComprados4));
        
        return facturaLista;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.clasesprogramaejemplos.Articulo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roger
 */
public class ArticuloDAO {
    
    public static ArrayList<Articulo> articuloLista = new ArrayList<Articulo>();
    
    public static List<Articulo> getArticulo(){
        
        // Crear diferentes objetos de ARTICULOS.
        articuloLista.add(new Articulo(1, "Mouse Intel P25", "Mouse de 300 DPI gaming", "Perifericos", 2500.00, 'Y', "Intel", 0, 25));
        articuloLista.add(new Articulo(2, "Monitor Microsoft", "Monitor de juego de 144hz", "Monitores", 400000.00, 'Y', "Microsoft", 2, 20));
        articuloLista.add(new Articulo(3, "Teclado Microsoft X2050", "Teclado ultra ergonomico", "Perifericos", 45000.00, 'Y', "Microsoft", 2,15));
        articuloLista.add(new Articulo(4, "Teclado Microsoft ZX25", "Teclado gaming", "Perifericos", 25000.00, 'Y', "Microsoft", 2,45));
        articuloLista.add(new Articulo(5, "Mouse Microsoft M250", "Mouse gaming", "Perifericos", 35000.00, 'Y', "Microsoft", 2, 10));
        articuloLista.add(new Articulo(6, "Laptop ASUS ROG 11", "Computadora gaming ", "Laptops", 650000.00, 'Y', "ASUS", 0, 15));
        articuloLista.add(new Articulo(7, "Laptop MacBookPro 15", "Laptop MacBookPro de 15 pulgads", "Laptops", 1250000.00, 'Y', "Apple", 0, 3));
        articuloLista.add(new Articulo(8, "Case Marvo", "Case de 7 luces y un ventilador", "Partes", 50000.00, 'Y', "Marvo", 0, 2));
        articuloLista.add(new Articulo(9, "Disco duro Kingston Arthur2", "HDD de 3.5", "Partes", 15000.00, 'Y', "Kingston", 0, 15));
        
        return articuloLista;
        
    }
    
}

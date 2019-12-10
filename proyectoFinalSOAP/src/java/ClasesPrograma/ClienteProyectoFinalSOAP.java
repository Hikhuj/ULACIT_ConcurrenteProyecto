/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrograma;

import java.util.ArrayList;

/**
 *
 * @author roger
 */
public class ClienteProyectoFinalSOAP {

    /**
     * @param args the command line arguments
     */
    
    public static int listaProductosComprados[] = {2,3,1};
    public static int listaProductosComprados1[] = {1,3,1};
    public static int listaProductosComprados2[] = {4,9,7};
    public static int listaProductosComprados3[] = {1,2,3};
    public static int listaProductosComprados4[] = {6,7,9};
    
    
    /*
        Aqui creamos la informacion que vamos a utilizar para interactuar con el WebService
    */
    public static ArrayList<Empleado> empleadosTienda = new ArrayList<Empleado>();
    public static ArrayList<Cliente> clientesTienda = new ArrayList<Cliente>();
    public static ArrayList<Proveedor> proveedorLista = new ArrayList<Proveedor>();
    public static ArrayList<Articulo> articuloLista = new ArrayList<Articulo>();
    public static ArrayList<Factura> facturaLista = new ArrayList<Factura>();
    
    
    public static void main(String[] args) {
        
        // Crear diferentes objetos de EMPLEADO.
        empleadosTienda.add(new Empleado(1, "rogerUser", "password123", "Roger", "Jose", "Ulate", "Rivera", "roger@ulate.com"));
        empleadosTienda.add(new Admin(2, "userAdmin", "password123", "User", "Admin", "Umana", "Jimenez", "userAdmin@test.com", "Lunes a Jueves, 7 am a 4 pm"));
        empleadosTienda.add(new SuperAdmin(3, "userSuperAdmin", "password123", "Super", "Admin", "Johnson", "Araya", "userSuperAdmin@test.com", "Sede Central"));
        empleadosTienda.add(new VendedorA(4, "userVendedor1", "password123", "Juan", "Antonio", "Rosales", "", "juan@test.com", 25));
        empleadosTienda.add(new VendedorA(5, "userVendedor2", "password123", "Jose", "Ricardo", "Mendez", "Montero", "jose@test.com", 15));
        empleadosTienda.add(new VendedorA(6, "userVendedor3", "password123", "Maria", "Jimenez", "Ramirez", "Mendoza", "maria@test.com", 50));
        empleadosTienda.add(new VendedorB(7, "userVendedor4", "password123", "Eduardo", "Loria", "Gonzalez", "Viquez", "eduardo@test.com", 45));
        empleadosTienda.add(new Empleado(8, "userContador", "password123", "Graciela", "Ezztriva", "Morale", "Zapata", "graciea@test.com"));
        
        // Crear distintos objetos de PROVEEDOR
        proveedorLista.add(new Proveedor(0, "Sin Proveedor", "", "", "", "", "", "", 0));
        proveedorLista.add(new Proveedor(1, "Intel", "USA", "California", "Manfred", "Morales", "Zapata", "proveedor@intel.com", 22225050));
        proveedorLista.add(new Proveedor(2, "Microsoft Costa Rica", "Costa Rica", "Heredia", "Mariela", "Alpizar", "Solis", "proveedor@microsoftcr.com", 22223030));
        proveedorLista.add(new Proveedor(3, "Olebelisco Sistemas", "Costa Rica", "San Jose", "Leonardo", "Garnier", "Geningen", "proveedor@olebelisco.com", 22229090));
        proveedorLista.add(new Proveedor(4, "Monge", "Costa Rica", "San Jose", "Melissa", "Mora", "Esquivel", "proveedor@importadoraMonge.com", 25250505));
        
        // Crear distintos objetos de ARTICULO
        articuloLista.add(new Articulo(1, "Mouse Intel P25", "Mouse de 300 DPI gaming", "Perifericos", 2500.00, 'Y', "Intel", 0, 25));
        articuloLista.add(new Articulo(2, "Monitor Microsoft", "Monitor de juego de 144hz", "Monitores", 400000.00, 'Y', "Microsoft", 2, 20));
        articuloLista.add(new Articulo(3, "Teclado Microsoft X2050", "Teclado ultra ergonomico", "Perifericos", 45000.00, 'Y', "Microsoft", 2,15));
        articuloLista.add(new Articulo(4, "Teclado Microsoft ZX25", "Teclado gaming", "Perifericos", 25000.00, 'Y', "Microsoft", 2,45));
        articuloLista.add(new Articulo(5, "Mouse Microsoft M250", "Mouse gaming", "Perifericos", 35000.00, 'Y', "Microsoft", 2, 10));
        articuloLista.add(new Articulo(6, "Laptop ASUS ROG 11", "Computadora gaming ", "Laptops", 650000.00, 'Y', "ASUS", 0, 15));
        articuloLista.add(new Articulo(7, "Laptop MacBookPro 15", "Laptop MacBookPro de 15 pulgads", "Laptops", 1250000.00, 'Y', "Apple", 0, 3));
        articuloLista.add(new Articulo(8, "Case Marvo", "Case de 7 luces y un ventilador", "Partes", 50000.00, 'Y', "Marvo", 0, 2));
        articuloLista.add(new Articulo(9, "Disco duro Kingston Arthur2", "HDD de 3.5", "Partes", 15000.00, 'Y', "Kingston", 0, 15));
        
        // Crear distintos objetos de CLIENTE.
        clientesTienda.add(new Cliente(1, "Roger", "Jose", "Ulate", "Rivera", "rulater530@ulacit.ed.cr"));
        clientesTienda.add(new Cliente(2, "Javier", "Jara", "Gonzales", "Bouterie", "cliente2@test.com"));
        clientesTienda.add(new Cliente(3, "Esteban", "Ulises", "Botero", "Solis", "cliente3@test.com"));
        clientesTienda.add(new Cliente(4, "Melissa", "Maitel", "Varieta", "Sozzccio", "cliente4@test.com"));
        
        // Crear distintos objetos de FACTURA
        facturaLista.add(new Factura(1, 2, "cliente2@test.com", "Javier", "Jose", "12/12/2019", "13:00", 250000.00, 2500.00, 255000.00, listaProductosComprados));
        facturaLista.add(new Factura(1, 2, "cliente2@test.com", "Javier", "Jose", "10/12/2019", "13:00", 150000.00, 2500.00, 255000.00, listaProductosComprados1)); 
        facturaLista.add(new Factura(1, 2, "cliente2@test.com", "Javier", "Maria", "23/12/2019", "14:00", 350000.00, 1500.00, 355000.00, listaProductosComprados2));
        facturaLista.add(new Factura(1, 3, "cliente3@test.com", "Esteban", "Maria", "01/09/2019", "15:00", 450000.00, 3500.00, 455000.00, listaProductosComprados3));
        facturaLista.add(new Factura(1, 3, "cliente3@test.com", "Esteban", "Maria", "15/10/2019", "16:00", 550000.00, 5500.00, 555000.00, listaProductosComprados4));
        
    }
    
}

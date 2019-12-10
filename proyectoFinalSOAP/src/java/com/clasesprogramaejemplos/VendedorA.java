package ClasesPrograma;

public class VendedorA extends Empleado implements Descuento {

    //atributo
    private int ClientesAtendidos;

    //constructor super
    public VendedorA() {
        super();
    }

    //constructor con hherencia

    public VendedorA(int id, String usuario, String contrasenia, String nombre1, String nombre2, String apellido1, String apellido2, String email, int ClientesAtendidos) {
        super(id, usuario, contrasenia, nombre1, nombre2, apellido1, apellido2, email);
        this.ClientesAtendidos = ClientesAtendidos;
    }
    

    //setters y getters
    public int getClientesAtendidos() {
        return ClientesAtendidos;
    }

    public void setClientesAtendidos(int ClientesAtendidos) {
        this.ClientesAtendidos = ClientesAtendidos;
    }

    //toString con herencia
    @Override
    public String toString() {
        return "VendedorA{" + super.toString() + "ClientesAtendidos=" + ClientesAtendidos + '}';
    }

    //metodo de interface
    @Override
    public void descuento() {
    }

}

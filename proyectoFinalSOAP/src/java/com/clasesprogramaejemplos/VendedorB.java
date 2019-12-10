package ClasesPrograma;

public class VendedorB extends Empleado implements Descuento {

    //atributo
    private int visitasRealizadas;

    //constructor super
    public VendedorB() {
        super();
    }

    //constructor normal con herencia de atributos

    public VendedorB(int id, String usuario, String contrasenia, String nombre1, String nombre2, String apellido1, String apellido2, String email, int visitasRealizadas) {
        super(id, usuario, contrasenia, nombre1, nombre2, apellido1, apellido2, email);
        this.visitasRealizadas = visitasRealizadas;
    }
    

    //getters y setters
    public int getVisitasRealizadas() {
        return visitasRealizadas;
    }

    public void setVisitasRealizadas(int visitasRealizadas) {
        this.visitasRealizadas = visitasRealizadas;
    }

    //toString con herencia
    @Override
    public String toString() {
        return "VendedorB{" + super.toString() + "visitasRealizadas=" + visitasRealizadas + '}';
    }

    //metodo interface
    @Override
    public void descuento() {
    }

}

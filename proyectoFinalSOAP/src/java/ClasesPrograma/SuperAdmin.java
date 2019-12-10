package ClasesPrograma;

public class SuperAdmin extends Empleado {

    //atributo
    private String asignarLocal;

    //constructor super
    public SuperAdmin() {
        super();
    }

    //constructor herencia

    public SuperAdmin(int id, String usuario, String contrasenia, String nombre1, String nombre2, String apellido1, String apellido2, String email, String asignarLocal) {
        super(id, usuario, contrasenia, nombre1, nombre2, apellido1, apellido2, email);
        this.asignarLocal = asignarLocal;
    }
    
    public String getAsignarLocal() {
        return asignarLocal;
    }

    public void setAsignarLocal(String asignarLocal) {
        this.asignarLocal = asignarLocal;
    }

    @Override
    public String toString() {
        return "SuperAdmin{" + super.toString() + "asignarLocal=" + asignarLocal + '}';
    }

}

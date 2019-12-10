package ClasesPrograma;

public class Admin extends Empleado {

    //atrinuto
    private String horarioDefinido;

    //constructor super
    public Admin() {
        super();
    }

    //constructor herencia

    public Admin(int id, String usuario, String contrasenia, String nombre1, String nombre2, String apellido1, String apellido2, String email, String horarioDefinido) {
        super(id, usuario, contrasenia, nombre1, nombre2, apellido1, apellido2, email);
        this.horarioDefinido = horarioDefinido;
    }

    public String getHorarioDefinido() {
        return horarioDefinido;
    }

    public void setHorarioDefinido(String horarioDefinido) {
        this.horarioDefinido = horarioDefinido;
    }

    @Override
    public String toString() {
        return "Admin{" + super.toString() + "horarioDefinido=" + horarioDefinido + '}';
    }

}

package ClasesPrograma;

public class Proveedor {

    //atributos
    private int id;
    private String nombreProveedor;
    private String paisProveedor;
    private String provinciaEstadoProveedor;
    private String nombreContactoProveedor;
    private String apellido1ContactoProveedor;
    private String apellido2ContactoProveedor;
    private String correoElectronicoContactoProveedor;
    private int telefonoOficinaProveedor;
    

    //constructor vacio
    public Proveedor() {
    }

    public Proveedor(int id, String nombreProveedor, String paisProveedor, String provinciaEstadoProveedor, String nombreContactoProveedor, String apellido1ContactoProveedor, String apellido2ContactoProveedor, String correoElectronicoContactoProveedor, int telefonoOficinaProveedor) {
        this.id = id;
        this.nombreProveedor = nombreProveedor;
        this.paisProveedor = paisProveedor;
        this.provinciaEstadoProveedor = provinciaEstadoProveedor;
        this.nombreContactoProveedor = nombreContactoProveedor;
        this.apellido1ContactoProveedor = apellido1ContactoProveedor;
        this.apellido2ContactoProveedor = apellido2ContactoProveedor;
        this.correoElectronicoContactoProveedor = correoElectronicoContactoProveedor;
        this.telefonoOficinaProveedor = telefonoOficinaProveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getPaisProveedor() {
        return paisProveedor;
    }

    public void setPaisProveedor(String paisProveedor) {
        this.paisProveedor = paisProveedor;
    }

    public String getProvinciaEstadoProveedor() {
        return provinciaEstadoProveedor;
    }

    public void setProvinciaEstadoProveedor(String provinciaEstadoProveedor) {
        this.provinciaEstadoProveedor = provinciaEstadoProveedor;
    }

    public String getNombreContactoProveedor() {
        return nombreContactoProveedor;
    }

    public void setNombreContactoProveedor(String nombreContactoProveedor) {
        this.nombreContactoProveedor = nombreContactoProveedor;
    }

    public String getApellido1ContactoProveedor() {
        return apellido1ContactoProveedor;
    }

    public void setApellido1ContactoProveedor(String apellido1ContactoProveedor) {
        this.apellido1ContactoProveedor = apellido1ContactoProveedor;
    }

    public String getApellido2ContactoProveedor() {
        return apellido2ContactoProveedor;
    }

    public void setApellido2ContactoProveedor(String apellido2ContactoProveedor) {
        this.apellido2ContactoProveedor = apellido2ContactoProveedor;
    }

    public String getCorreoElectronicoContactoProveedor() {
        return correoElectronicoContactoProveedor;
    }

    public void setCorreoElectronicoContactoProveedor(String correoElectronicoContactoProveedor) {
        this.correoElectronicoContactoProveedor = correoElectronicoContactoProveedor;
    }

    public int getTelefonoOficinaProveedor() {
        return telefonoOficinaProveedor;
    }

    public void setTelefonoOficinaProveedor(int telefonoOficinaProveedor) {
        this.telefonoOficinaProveedor = telefonoOficinaProveedor;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "id=" + id + ", nombreProveedor=" + nombreProveedor + ", paisProveedor=" + paisProveedor + ", provinciaEstadoProveedor=" + provinciaEstadoProveedor + ", nombreContactoProveedor=" + nombreContactoProveedor + ", apellido1ContactoProveedor=" + apellido1ContactoProveedor + ", apellido2ContactoProveedor=" + apellido2ContactoProveedor + ", correoElectronicoContactoProveedor=" + correoElectronicoContactoProveedor + ", telefonoOficinaProveedor=" + telefonoOficinaProveedor + '}';
    }

}

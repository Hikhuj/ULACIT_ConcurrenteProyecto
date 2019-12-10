package ClasesPrograma;

public class Local {

    //atributos
    private int id;
    private String direccion1;
    private String direccion2;
    private String provincia;
    private String canton;
    private String distrito;
    private String telefono;
    private String email;
//constructor vacio

    public Local() {
    }

    //constructor normal
    public Local(int id, String direccion1, String direccion2, String provincia, String canton, String distrito, String telefono, String email) {
        this.id = id;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.telefono = telefono;
        this.email = email;
    }
//setters y getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//toString

    @Override
    public String toString() {
        return "Local{" + "id=" + id + ", direccion1=" + direccion1 + ", direccion2=" + direccion2 + ", provincia=" + provincia + ", canton=" + canton + ", distrito=" + distrito + ", telefono=" + telefono + ", email=" + email + '}';
    }

}

package ClasesPrograma;

//atributos
public class Factura {

    private int id;
    private int idCliente;
    private String emailCliente;
    private String nombreCliente;
    private String nombreCajero;
    private String fecha;
    private String hora;
    private double subtotal;
    private double impuesto;
    private double total;
    private int[] articulos;

    //constructor vacio
    public Factura() {
    }

    public Factura(int id, int idCliente, String emailCliente, String nombreCliente, String nombreCajero, String fecha, String hora, double subtotal, double impuesto, double total, int[] articulos) {
        this.id = id;
        this.idCliente = idCliente;
        this.emailCliente = emailCliente;
        this.nombreCliente = nombreCliente;
        this.nombreCajero = nombreCajero;
        this.fecha = fecha;
        this.hora = hora;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
        this.articulos = articulos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCajero() {
        return nombreCajero;
    }

    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero = nombreCajero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int[] getArticulos() {
        return articulos;
    }

    public void setArticulos(int[] articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", idCliente=" + idCliente + ", emailCliente=" + emailCliente + ", nombreCliente=" + nombreCliente + ", nombreCajero=" + nombreCajero + ", fecha=" + fecha + ", hora=" + hora + ", subtotal=" + subtotal + ", impuesto=" + impuesto + ", total=" + total + ", articulos=" + articulos + '}';
    }

}

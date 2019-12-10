package ClasesPrograma;

public class Articulo {

    //atributos
    private int id;
    private String nombre;
    private String descripcion;
    private String categoria;
    private double precio;
    private char disponible;
    private String marca;
    private int idProveedor;
    private int cantidadDisponible;

    //constructor vacio
    public Articulo() {
    }

    public Articulo(int id, String nombre, String descripcion, String categoria, double precio, char disponible, String marca, int idProveedor, int cantidadDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.disponible = disponible;
        this.marca = marca;
        this.idProveedor = idProveedor;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public char getDisponible() {
        return disponible;
    }

    public void setDisponible(char disponible) {
        this.disponible = disponible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Articulo{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria + ", precio=" + precio + ", disponible=" + disponible + ", marca=" + marca + ", idProveedor=" + idProveedor + ", cantidadDisponible=" + cantidadDisponible + '}';
    }
    
}

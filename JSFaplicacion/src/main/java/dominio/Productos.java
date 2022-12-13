/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Allan
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Producto.findAll",query="Select p From Productos p Order by p.id_producto")
})
@Table(name ="productos")
public class Productos implements Serializable {
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_producto")
    private int id_producto;
    @Column(name="nombre")
    private String nombrePro;
    @Column(name="precio")
    private double precio;
    @Column(name="imagen")
    private String imagen;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name ="id_categoria")
    private int id_categoria;
    @Column(name="id_proveedor")
    private int id_proveedor;

    public Productos() {
    }

    public Productos(int id_producto, String nombrePro, double precio, String imagen, String descripcion, int id_categoria, int id_proveedor) {
        this.id_producto = id_producto;
        this.nombrePro = nombrePro;
        this.precio = precio;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.id_categoria = id_categoria;
        this.id_proveedor = id_proveedor;
    }

    public Productos(int id_producto) {
        this.id_producto = id_producto;
    }

    public Productos(String nombrePro, double precio, String imagen, String descripcion, int id_categoria, int id_proveedor) {
        this.nombrePro = nombrePro;
        this.precio = precio;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.id_categoria = id_categoria;
        this.id_proveedor = id_proveedor;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId_producto() {
        return id_producto;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public double getPrecio() {
        return precio;
    }

    public String getImagen() {
        return imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    @Override
    public String toString() {
        return "Productos{" + "id_producto=" + id_producto + ", nombrePro=" + nombrePro + ", precio=" + precio + ", imagen=" + imagen + ", descripcion=" + descripcion + ", id_categoria=" + id_categoria + ", id_proveedor=" + id_proveedor + '}';
    }
    
    
}

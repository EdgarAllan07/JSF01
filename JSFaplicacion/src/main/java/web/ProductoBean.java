/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import dominio.Productos;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;
import servicios.ProductosServicio;

/**
 *
 * @author Allan
 */
@Named("productobean")
@RequestScoped
public class ProductoBean {
    @Inject
    private ProductosServicio ps;
    private Productos producto;
    List <Productos> productos;

    public ProductoBean() {
    }
    
    @PostConstruct
    public void inicalizar(){
        productos = ps.listaProducto();
        producto =  new Productos();
    }
    
    public void editListener(RowEditEvent event){
        Productos producto = (Productos) event.getObject();
        
    }

    public Productos getProducto() {
        return producto;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    
}

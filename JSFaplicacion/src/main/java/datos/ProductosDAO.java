/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import dominio.Productos;
import java.util.List;

/**
 *
 * @author Allan
 */
public interface ProductosDAO {
    
    public List<Productos> findAllProductos();
    
    public Productos findByIdProducto(Productos producto);
    
    public void insertarProducto(Productos producto);
    
    public void updateProducto(Productos producto);
    
    public void deleteProducto(Productos producto);
    
}

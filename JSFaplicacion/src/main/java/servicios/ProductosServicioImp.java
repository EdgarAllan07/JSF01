/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import datos.ProductosDAO;
import dominio.Productos;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Allan
 */
public class ProductosServicioImp implements ProductosServicio {

    @Inject 
    ProductosDAO pd;
    
    @Override
    public List<Productos> listaProducto() {
      return pd.findAllProductos();
    }

    @Override
    public Productos encontrarProductoId(Productos producto) {
       return pd.findByIdProducto(producto);
    }

    @Override
    public void registrarProducto(Productos producto) {
         pd.insertarProducto(producto);
    }

    @Override
    public void actualizarProducto(Productos producto) {
        pd.updateProducto(producto);
    }

    @Override
    public void eliminarProducto(Productos producto) {
        pd.deleteProducto(producto);
    }
    
    
    
}

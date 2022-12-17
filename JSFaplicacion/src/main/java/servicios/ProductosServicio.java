/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicios;

import dominio.Productos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Allan
 */
@Local
public interface ProductosServicio {
    
    
   public List<Productos> listaProducto();
   
   public Productos encontrarProductoId(Productos producto);
   
   public void registrarProducto(Productos producto);
   
   public void actualizarProducto(Productos producto);
   
   public void eliminarProducto(Productos producto);
   
}

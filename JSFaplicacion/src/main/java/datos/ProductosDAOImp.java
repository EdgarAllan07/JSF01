/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Productos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Allan
 */

@Stateless
public class ProductosDAOImp implements ProductosDAO {

     @PersistenceContext(unitName="aplicacionPU")
    EntityManager em;

    @Override
    public List<Productos> findAllProductos() {
       return em.createNamedQuery("Producto.findAll").getResultList();
    }

    @Override
    public Productos findByIdProducto(Productos producto) {
        return em.find(Productos.class,producto.getId_producto());
    }

    @Override
    public void insertarProducto(Productos producto) {
        em.persist(producto);
    }

    @Override
    public void updateProducto(Productos producto) {
        em.merge(producto);
    }

    @Override
    public void deleteProducto(Productos producto) {
       em.remove(em.merge(producto));
    }
    
}

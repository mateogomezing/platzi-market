package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
// encargado de interactuar con base de datos
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {


    //    @Query(value="SELECT * FROM productos WHERE id_categoria = ?",nativeQuery = true)
//    List<Producto>getByCategoria(int idcategoria);
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}

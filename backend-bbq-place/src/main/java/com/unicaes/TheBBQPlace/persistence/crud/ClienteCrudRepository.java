package com.unicaes.TheBBQPlace.persistence.crud;

import com.unicaes.TheBBQPlace.persistence.entity.ClienteEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteCrudRepository extends CrudRepository<ClienteEntity, Integer> {
    //@Query(value = "SELECT * FROM cliente WHERE id_cliente = ?", nativeQuery = true) FORMA NATIVA
    List<ClienteEntity> findByIdClienteOrderByNombreAsc(int idCliente);

}

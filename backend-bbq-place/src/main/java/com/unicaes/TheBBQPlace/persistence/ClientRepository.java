package com.unicaes.TheBBQPlace.persistence;

import com.unicaes.TheBBQPlace.persistence.crud.ClienteCrudRepository;
import com.unicaes.TheBBQPlace.persistence.entity.ClienteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ClienteRepository {
    @Autowired
    private ClienteCrudRepository clienteCrudRepositorio;

    public List<ClienteEntity> gellAll(){
        return (List<ClienteEntity>) clienteCrudRepositorio.findAll();
    }
    public List<ClienteEntity> getBycliente(int idCliente){
        return clienteCrudRepositorio.findByIdClienteOrderByNombreAsc(idCliente);
    }
}

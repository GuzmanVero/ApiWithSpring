package com.unicaes.TheBBQPlace.domain.service;

import com.unicaes.TheBBQPlace.persistence.crud.ClientCrudRepository;
import com.unicaes.TheBBQPlace.persistence.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public ClientEntity save(ClientEntity client) {
        return clientCrudRepository.save(client);
    }

    public ClientEntity getId(int clientId) {
        return clientCrudRepository.findById(clientId);
    }
}

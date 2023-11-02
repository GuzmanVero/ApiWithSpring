package com.unicaes.TheBBQPlace.web.controller;

import com.unicaes.TheBBQPlace.domain.service.ClientService;
import com.unicaes.TheBBQPlace.persistence.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/registro")
    public ClientEntity save(@RequestBody ClientEntity client){
        return clientService.save(client);
    }

    @GetMapping("/{id}")
    public ClientEntity getId(@PathVariable("id") int clientId) {
        return clientService.getId(clientId);
    }
}

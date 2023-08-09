package com.example.Homebanking.controllers;

import com.example.Homebanking.dtos.ClientDTO;
import com.example.Homebanking.models.Client;
import com.example.Homebanking.repositories.ClientRepository;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientRepository repo;

    public List<ClientDTO> getClients{
        return repo.findAll().stream().map(ClientDTO::new).collect(toList());
    }

}

package com.example.Homebanking.dtos;

import com.example.Homebanking.models.Client;

public class ClientDTO (Client client) {

    this.id = client.getId();
    this.name = client.getName();
    this.lastName = client.getlastName();
    this.email = client.getEmail();

}

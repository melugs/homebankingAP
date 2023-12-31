package com.example.Homebanking;

import com.example.Homebanking.models.Client;
import com.example.Homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository){
		return (args -> {
			Client client1 = new Client();

			client1.setName("Melba");
			client1.setLastName("Morel");
			client1.setEmail("melba@mindhub.com");

			clientRepository.save(client1);
		});

	}
}

package com.example.Homebanking;

import com.example.Homebanking.models.Account;
import com.example.Homebanking.models.Client;
import com.example.Homebanking.repositories.AccountRepository;
import com.example.Homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository,AccountRepository accountRepository){
		return (args -> {
			Client client1 = new Client();

			client1.setName("Melba");
			client1.setLastName("Morel");
			client1.setEmail("melba@mindhub.com");

			Client client2 = new Client("Pedro", "Lopez", "pedrol@mindhub.com");

			clientRepository.save(client1);
			clientRepository.save(client2);

			Account account1 = new Account("VIN001", LocalDate.now(),5000.0);
			Account account2 = new Account("VIN002", LocalDate.now().plusDays(1),7500.0);

			client1.addAccount(account1);
			client1.addAccount(account2);

			Account account3 = new Account ("VIN003", LocalDate.now(), 6700.0);
			Account account4 = new Account ("VIN004", LocalDate.now().plusDays(2), 1000.0);

			client2.addAccount(account3);
			client2.addAccount(account4);
		});

	}


}

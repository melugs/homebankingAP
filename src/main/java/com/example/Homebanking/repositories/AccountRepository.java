package com.example.Homebanking.repositories;

import com.example.Homebanking.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {
}

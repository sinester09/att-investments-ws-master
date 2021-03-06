package br.com.attinvestments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.attinvestments.domain.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

}

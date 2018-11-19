package fr.sg.kata.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.sg.kata.repository.models.Account;
import fr.sg.kata.repository.models.Transaction;

public interface ITransactionRepository extends CrudRepository<Transaction, BigInteger> {
	
	List<Transaction> findByAccount(Account account);

}

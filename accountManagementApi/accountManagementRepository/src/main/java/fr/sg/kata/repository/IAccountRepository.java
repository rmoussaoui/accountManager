package fr.sg.kata.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import fr.sg.kata.repository.models.Account;

public interface IAccountRepository extends CrudRepository<Account,BigInteger> {

}

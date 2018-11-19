package fr.sg.kata.services;

import java.time.LocalDate;
import java.util.List;

import fr.sg.kata.repository.models.Account;
import fr.sg.kata.repository.models.Transaction;

public interface IAccountService {
	
	public void doTransaction(Transaction transaction);
	
	public List<Transaction> getJournal(Account account, LocalDate startDate, LocalDate endDate);

}

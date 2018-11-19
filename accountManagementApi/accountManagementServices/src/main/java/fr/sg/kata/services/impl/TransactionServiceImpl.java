package fr.sg.kata.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import fr.sg.kata.repository.IAccountRepository;
import fr.sg.kata.repository.ITransactionRepository;
import fr.sg.kata.repository.models.Account;
import fr.sg.kata.repository.models.Transaction;
import fr.sg.kata.repository.models.TransactionType;
import fr.sg.kata.services.ITransactionService;

public class TransactionServiceImpl implements ITransactionService {
	
	@Autowired
	private IAccountRepository accountRepository;
	
	@Autowired
	private ITransactionRepository transactionRepository;

	public void doTransaction(Transaction transaction) {
		Optional<Account> optAccount = accountRepository.findById(transaction.getAccount().getAccount_id());
		
		if (!optAccount.isPresent()) {
			//TODO: throws an exception
		}
		
		Account account = optAccount.get();
		
		if (TransactionType.D.equals(transaction.getTransactionType())) {
			//performing a deposit
			transaction.setBalance(account.getBalance().add(transaction.getAmount()));
		
		}
		else if(TransactionType.W.equals(transaction.getTransactionType())) {
			//performing a withdrawal
			transaction.setBalance(account.getBalance().subtract(transaction.getAmount()));
		}
		
		transactionRepository.save(transaction);
	}

	public List<Transaction> getJournal(Account account, LocalDate startDate, LocalDate endDate) {
		//checks if account exists
		Optional<Account> optAccount = accountRepository.findById(account.getAccount_id());
		if (!optAccount.isPresent() ) {
			//TODO: throw an exception
		}
		
		return transactionRepository.findByAccount(account);
		
	}

}

package fr.sg.kata.repository.models;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue
	private BigInteger transaction_id;
	
	@ManyToOne
	private Account account;
	private LocalDate transactionDate;
	private TransactionType transactionType;
	private BigDecimal amount;
	private BigDecimal balance;
	
	public BigInteger getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(BigInteger transaction_id) {
		this.transaction_id = transaction_id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}

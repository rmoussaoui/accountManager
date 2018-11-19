package fr.sg.kata.repository.models;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private BigInteger account_id;
	private String account_nb;
	private BigDecimal balance;
	@ManyToOne
	private Client client;
	
	public BigInteger getAccount_id() {
		return account_id;
	}
	public void setAccount_id(BigInteger account_id) {
		this.account_id = account_id;
	}
	public String getaccount_nb() {
		return account_nb;
	}
	public void setaccount_nb(String account_nb) {
		this.account_nb = account_nb;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
}

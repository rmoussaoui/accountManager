package fr.sg.kata.repository.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
	private String client_id;
	private String lastname;
	private String firstname;
	
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
}


package fr.sg.kata.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.sg.kata.repository.models.Transaction;

@RestController
@RequestMapping("v1/accounts")
public class AccountController {

	@RequestMapping(method=RequestMethod.GET, value="{accountId}/transactions")
	public List<Transaction> getJournal() {
		return null;
	}
	
	@PostMapping(value="{accountId}/transactions")
	public void createTransaction(@RequestBody Transaction transaction) {
		
	}
}

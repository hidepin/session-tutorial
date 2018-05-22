package com.example.session.api.account;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountRestController {

	@Inject
	SessionRegistry sessionRegistry;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<AccountResource> getAccount() {
		List<AccountResource> accountResources = new ArrayList<>();

		for ( Object principal : sessionRegistry.getAllPrincipals() ) {
			AccountResource accountResource = new AccountResource();
			accountResource.setUsername(sessionRegistry.getAllSessions(principal, false).toString());
			accountResources.add(accountResource);
       	}
		return accountResources;
	}
	
}

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

import com.example.session.domain.service.userdetails.AccountDetails;

@RestController
@RequestMapping("account")
public class AccountRestController {

	@Inject
	SessionRegistry sessionRegistry;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<AccountResource> getAccount() {
		List<AccountResource> accountResources = new ArrayList<>();
/*
		for ( Object principal : sessionRegistry.getAllPrincipals() ) {
			if (principal instanceof AccountDetails) {
				AccountResource accountResource = new AccountResource();	
				AccountDetails accountDetails = (AccountDetails)principal;
				accountResource.setUsername(accountDetails.getAccount().getEmail());	
				accountResources.add(accountResource);
			}
       	}
*/
		return accountResources;
	}
	
}

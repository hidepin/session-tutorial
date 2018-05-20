package com.example.session.api.account;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountRestController {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<AccountResource> getAccount() {
		List<AccountResource> accountResources = new ArrayList<>();
		AccountResource accountResource = new AccountResource();
		accountResource.setUsername("sample");
		accountResources.add(accountResource);
		return accountResources;
	}
	
}

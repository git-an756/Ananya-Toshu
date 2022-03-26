package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.dao.Account;

public interface AccountService {
	public List<Account> getAll();
	public Account getById(int id);
	public void transfer(int fromAccId, int toAccId, double amount);
	public void deposit(int accNo, double amount);
	public void withdraw(int accNo, double amount);
	
}

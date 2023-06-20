package minibank.bankApplication.service;

import minibank.bankApplication.model.Account;

import java.util.List;

public interface AccountService {

    public Account saveAccount(Account account);

    public List<Account> getAccount();

    public void transfer(Account from, Account to, double amount);

    public void topUp(Account account, double amount);

}

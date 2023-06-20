package minibank.bankApplication.service;

import minibank.bankApplication.model.Account;
import minibank.bankApplication.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAccount() {
        return accountRepository.findAll();
    }

    @Override
    public void transfer(Account from, Account to, double amount) {
        from.setBalance(from.getBalance()-amount);
        to.setBalance(to.getBalance()+amount);
    }

    @Override
    public void topUp(Account account, double amount) {
        account.setBalance(account.getBalance()+amount);
    }
}

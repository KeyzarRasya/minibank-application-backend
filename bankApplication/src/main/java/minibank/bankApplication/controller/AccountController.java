package minibank.bankApplication.controller;

import minibank.bankApplication.model.Account;
import minibank.bankApplication.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/add")
    public String addAccount(@RequestBody Account account){
        accountService.saveAccount(account);
        return "New Account Added";
    }

    @GetMapping("/getAll")
    public List<Account> getAcc(){
        return accountService.getAccount();
    }

    @GetMapping("/transfer")
    public String transfer(Account from, Account to, double amount){
        accountService.transfer(from, to, amount);
        return "Transfer Success";
    }

    @GetMapping("/topup")
    public String topUp(Account account, double amount){
        accountService.topUp(account, amount);
        return "Top Up Successfully";
    }

}

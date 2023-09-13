package account.controller;

import account.model.Accounts;
import account.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eazy Bytes
 */

@RestController
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

    @GetMapping("/myAccount")
    public Accounts getAccountDetails() {

        return accountsRepository.findByCustomerId(1L);

    }

}

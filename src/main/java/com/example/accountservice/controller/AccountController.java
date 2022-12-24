package com.example.accountservice.controller;

import com.example.accountservice.model.AccountEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    private static Map<String, List<AccountEntity>> bankDb;

    static {
        bankDb = new HashMap<>();
        List<AccountEntity> accList = new ArrayList<>();
        AccountEntity account = new AccountEntity(123456789L,"Mohsen-Malakouti");
        accList.add(account);
        account = new AccountEntity(123456790L,"Ali-Ahmadi");
        accList.add(account);
        bankDb.put("Melat-Bank",accList);

        accList = new ArrayList<>();
        account = new AccountEntity(123456788L,"Ahmad-Mohammadi");
        accList.add(account);
        account = new AccountEntity(123456787L,"Ali-heidari");
        accList.add(account);
        bankDb.put("Sepah-Bank",accList);
    }



    @GetMapping("/fetchAccOfTheGivenBank/{bankName}")
    public List<AccountEntity> getBankAccountByAccount(@PathVariable String bankName){
        System.out.println("The list of account in " + bankName + " is: ");
        List<AccountEntity> accList = bankDb.get(bankName);
        if(accList == null){
            accList = new ArrayList<>();
            AccountEntity acc = new AccountEntity(1L,"N/L");
            accList.add(acc);
        }
        return accList;
    }
}

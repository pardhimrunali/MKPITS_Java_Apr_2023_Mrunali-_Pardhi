package com.example.demoSpringBootOverview.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {



    //----------------------------------------scope of bean------------------------------------------------
//    Account accountfirst;
//    Account accountsecond;
//
//


//    public Controller(Account accountfirst, Account accountsecond) {
//        this.accountfirst = accountfirst;
//        this.accountsecond = accountsecond;
//    }



//    @GetMapping("/check")
//    public boolean check()
//    {
//        return accountfirst==accountsecond;
//    }
//    @GetMapping("checkscope")
//    public String checkscope(){
//        return "returns"+" "+(accountfirst==accountsecond);
//    }

    //------------------postConstructor and predestroy concept (lifecycle-)-------------------------------------------

//    private CurrentAccount currentAccount;
//    @Autowired
//
//    public Controller(CurrentAccount currentAccount) {
//        this.currentAccount = currentAccount;
//    }




    //-----------------third party access without giving the component-------------------------------------------
    private Account account;
@Autowired
    public Controller(@Qualifier("loanAccount") Account account) {
        this.account = account;
    }
    @GetMapping("/getloan")
    public String displayloan()
    {
        return account.display();
    }
}

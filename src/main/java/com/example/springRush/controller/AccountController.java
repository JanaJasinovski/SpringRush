package java.com.example.springRush.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.AccountNotFoundException;
import java.com.example.springRush.model.Account;
import java.com.example.springRush.payload.TransferRequest;
import java.com.example.springRush.service.TransferService;
import java.util.List;

@RestController
public class AccountController {
    private final TransferService transferService;
    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }
//    @PostMapping("/transfer")
//    public void transferMoney(
//            @RequestBody TransferRequest request
//    ) {
//        transferService.transferMoney(
//                request.getSenderAccountId(),
//                request.getReceiverAccountId(),
//                request.getAmount());
//    }
//    @GetMapping("/accounts")
//    public List<Account> getAllAccounts() {
//        return transferService.getAllAccounts();
//    }

    @PostMapping("/transfer")
    public void transferMoney(
            @RequestBody TransferRequest request
    ) throws AccountNotFoundException {
        transferService.transferMoney(
                request.getSenderAccountId(),
                request.getReceiverAccountId(),
                request.getAmount());
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(
            @RequestParam(required = false) String name
    ) {
        if (name == null) {
            return transferService.getAllAccounts();
        } else {
            return transferService.findAccountsByName(name);
        }
    }
}

package java.com.example.springRush.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.login.AccountNotFoundException;
import java.com.example.springRush.model.Account;
import java.com.example.springRush.repository.AccountRepository;
import java.math.BigDecimal;
import java.util.List;

@Service
public class TransferService {
    private final AccountRepository accountRepository;
    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
//    @Transactional
//    public void transferMoney(long idSender,
//                              long idReceiver,
//                              BigDecimal amount) {
//        Account sender =
//                accountRepository.findAccountById(idSender);
//        Account receiver =
//                accountRepository.findAccountById(idReceiver);
//        BigDecimal senderNewAmount =
//                sender.getAmount().subtract(amount);
//        BigDecimal receiverNewAmount =
//                receiver.getAmount().add(amount);
//        accountRepository
//                .changeAmount(idSender, senderNewAmount);
//        accountRepository
//                .changeAmount(idReceiver, receiverNewAmount);
//    }

//    public List<Account> getAllAccounts() {
//        return accountRepository.findAllAccounts();
//    }
//
//    @Transactional
//    public void transferMoney(
//            long idSender,
//            long idReceiver,
//            BigDecimal amount) {
//        Account sender = accountRepository.findAccountById(idSender);
//        Account receiver = accountRepository.findAccountById(idReceiver);
//        BigDecimal senderNewAmount = sender.getAmount().subtract(amount);
//        BigDecimal receiverNewAmount = receiver.getAmount().add(amount);
//        accountRepository.changeAmount(idSender, senderNewAmount);
//        accountRepository.changeAmount(idReceiver, receiverNewAmount);
//        throw new RuntimeException("Oh no! Something went wrong!");
//    }

    @Transactional
    public void transferMoney(
            long idSender,
            long idReceiver,
            BigDecimal amount) throws AccountNotFoundException {
        Account sender =
                accountRepository.findById(idSender)
                        .orElseThrow(() -> new AccountNotFoundException());
        Account receiver =
                accountRepository.findById(idReceiver)
                        .orElseThrow(() -> new AccountNotFoundException());
        BigDecimal senderNewAmount =
                sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount =
                receiver.getAmount().add(amount);
        accountRepository
                .changeAmount(idSender, senderNewAmount);
        accountRepository
                .changeAmount(idReceiver, receiverNewAmount);
    }

    public Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
    public List<Account> findAccountsByName(String name) {
        return accountRepository.findAccountsByName(name);
    }
}
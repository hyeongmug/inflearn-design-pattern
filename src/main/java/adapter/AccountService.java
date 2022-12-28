package adapter;

public class  AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword("password");
        account.setEmail("email");
        return account;
    }

    public void createNewAccount(Account account) {
    }

    public void updateAccount(Account account) {
    }
}

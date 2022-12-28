package adapter;

import adapter.security.UserDetail;

public class AccountUserDetails implements UserDetail {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public Object getPassword() {
        return account.getPassword();
    }

    @Override
    public String getUsername() {
        return account.getUsername();
    }
}

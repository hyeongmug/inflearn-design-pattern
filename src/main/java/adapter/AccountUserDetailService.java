package adapter;

import adapter.security.UserDetail;
import adapter.security.UserDetailService;

// AccountService 와 UserDetailService 를 연결해주는 어댑터
public class AccountUserDetailService implements UserDetailService {

    AccountService accountService;

    AccountUserDetailService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetail loadUser(String username) {
        AccountService accountService = new AccountService();
        accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}

package adapter;

import adapter.security.LoginHandler;
import adapter.security.UserDetailService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailService userDetailService = new AccountUserDetailService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailService);
        String login = loginHandler.login("username", "password");
        System.out.println(login);
    }
}

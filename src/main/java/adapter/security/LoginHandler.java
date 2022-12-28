package adapter.security;

public class LoginHandler {

    UserDetailService userDetailService;

    public LoginHandler(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    public String login(String username, String password) {
        UserDetail userDetail = userDetailService.loadUser(username);
        if (userDetail.getPassword().equals(password)) {
            return userDetail.getUsername();
        } else {
            throw new IllegalArgumentException();
        }
    }
}

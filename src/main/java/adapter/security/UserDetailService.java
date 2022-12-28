package adapter.security;

public interface UserDetailService {

        UserDetail loadUser(String username);
}

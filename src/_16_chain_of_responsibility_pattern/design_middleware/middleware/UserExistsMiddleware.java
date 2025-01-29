package _16_chain_of_responsibility_pattern.design_middleware.middleware;

import _16_chain_of_responsibility_pattern.design_middleware.server.UserService;

public class UserExistsMiddleware extends Middleware{
    private final UserService userService;

    public UserExistsMiddleware(UserService userService){
        this.userService = userService;
    }

    @Override
    public boolean check(String email, String password) {
        if(!userService.hasEmail(email)){
            System.out.println("User with email: " + email + " does not exists");
            return false;
        }
        if(!userService.isValidPassword(email, password)){
            System.out.println("Wrong password!");
            return false;
        }
        return nextCheck(email, password);
    }
}

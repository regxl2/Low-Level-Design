package _16_chain_of_responsibility_pattern.design_middleware.middleware;

public class RoleCheckMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {
        if(email.equals("admin@gmail.com")){
            System.out.println("Hello admin");
            return true;
        }
        System.out.println("Hello User");
        return nextCheck(email, password);
    }
}

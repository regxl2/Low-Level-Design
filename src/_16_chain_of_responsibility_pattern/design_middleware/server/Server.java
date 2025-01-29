package _16_chain_of_responsibility_pattern.design_middleware.server;

import _16_chain_of_responsibility_pattern.design_middleware.middleware.Middleware;

public class Server {
    private final Middleware middleware;

    public Server(Middleware middleware){
        this.middleware = middleware;
    }

    public boolean login(String email, String password){
        if(middleware.check(email, password)){
            System.out.println("Authorization have been successful!");
            return true;
        }
        return false;
    }
}

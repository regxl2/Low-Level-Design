package _16_chain_of_responsibility_pattern.design_middleware;

import _16_chain_of_responsibility_pattern.design_middleware.middleware.Middleware;
import _16_chain_of_responsibility_pattern.design_middleware.middleware.RoleCheckMiddleware;
import _16_chain_of_responsibility_pattern.design_middleware.middleware.ThrottlingMiddleware;
import _16_chain_of_responsibility_pattern.design_middleware.middleware.UserExistsMiddleware;
import _16_chain_of_responsibility_pattern.design_middleware.server.Server;
import _16_chain_of_responsibility_pattern.design_middleware.server.UserService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        UserService userService = new UserService();
        userService.registerUser("regxl@gmail.com", "helloworld");
        userService.registerUser("ballu@gmail.com", "helloworld");
        userService.registerUser("admin@gmail.com", "helloworld");

        Middleware middleware = Middleware.linkMiddleware(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(userService),
                new RoleCheckMiddleware()
        );

        Server server = new Server(middleware);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean success;
        do{
            System.out.print("Enter your email: ");
            String email = reader.readLine();
            System.out.println();
            System.out.print("Enter your password: ");
            String password = reader.readLine();
            System.out.println();
            success = server.login(email, password);
        }
        while (!success);
    }
}

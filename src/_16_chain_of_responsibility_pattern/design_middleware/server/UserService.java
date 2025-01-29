package _16_chain_of_responsibility_pattern.design_middleware.server;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private final Map<String, String> userDetails = new HashMap<>();

    public void registerUser(String email, String password){
        userDetails.put(email, password);
    }

    public boolean hasEmail(String email){
        return userDetails.containsKey(email);
    }

    public boolean isValidPassword(String email, String password){
        return userDetails.get(email).equals(password);
    }
}

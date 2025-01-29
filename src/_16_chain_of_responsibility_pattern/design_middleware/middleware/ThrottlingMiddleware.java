package _16_chain_of_responsibility_pattern.design_middleware.middleware;

// This middleware check whether the limit on the number of requests is reached

public class ThrottlingMiddleware extends Middleware{
    private final int requestPerMinute;
    private int requests;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute){
        this.requestPerMinute = requestPerMinute;
        this.requests = 0;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String email, String password) {
        if(System.currentTimeMillis() > currentTime + 60_000){
            requests = 0;
            currentTime = System.currentTimeMillis();
        }
        ++requests;
        if(requests > requestPerMinute){
            System.out.println("Requests limit exceeded!");
            return false;
        }
        return nextCheck(email, password);
    }
}

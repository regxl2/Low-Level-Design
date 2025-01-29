package _16_chain_of_responsibility_pattern.design_middleware.middleware;

public abstract class Middleware {
    private Middleware nextMiddleWare;

    public static Middleware linkMiddleware(Middleware first, Middleware... chain){
        Middleware head = first;
        for( Middleware middleware : chain){
            head.nextMiddleWare = middleware;
            head = middleware;
        }
        return first;
    }
    public abstract boolean check(String email, String password);

    protected boolean nextCheck(String email, String password){
        if(nextMiddleWare == null){
            return true;
        }
        return nextMiddleWare.check(email, password);
    }
}

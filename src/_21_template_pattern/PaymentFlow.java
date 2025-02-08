package _21_template_pattern;

// When you want all classes to follow the specific steps to process the task.
// but also need to provide the flexibility that each class can have their own
// logic in that specific steps.

public abstract class PaymentFlow {

    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    // this is a template method, it defines the order in which tasks will be executed.
    public final void sendMoney(){
        validateRequest();
        debitAmount();
        calculateFees();
        creditAmount();
    }
}

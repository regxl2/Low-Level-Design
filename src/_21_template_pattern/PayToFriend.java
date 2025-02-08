package _21_template_pattern;

public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate request: PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculate fees: PayToFriend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit amount: PayToFriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit amount: PayToFriend");
    }
}

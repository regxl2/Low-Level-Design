package _21_template_pattern;

public class PayToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate request: PayToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculate fees: PayToMerchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit amount: PayToMerchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit amount: PayToMerchant");
    }
}

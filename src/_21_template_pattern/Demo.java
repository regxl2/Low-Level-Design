package _21_template_pattern;

public class Demo {
    public static void main(String[] args) {
        PaymentFlow payToMerchant = new PayToMerchant();
        payToMerchant.sendMoney();
        System.out.println();
        PaymentFlow payToFriend = new PayToFriend();
        payToFriend.sendMoney();
    }
}

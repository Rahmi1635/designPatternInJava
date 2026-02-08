//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Payment payment1=new BankTransferPayment();
        payment1.processPayment();

        Payment payment2=new PaymentFactory().createPayment(PaymentType.CREDIT_CARD);
        payment2.processPayment();

    }
}
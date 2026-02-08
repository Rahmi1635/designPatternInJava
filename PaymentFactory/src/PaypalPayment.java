public class PaypalPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Paypal ile ödemeniz gerçekleştirildi.");
    }
}

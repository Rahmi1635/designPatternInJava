import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactory {

    private static Map<PaymentType, Supplier<Payment>> PAYMENT_MAP=new HashMap<>();

    static {
        PAYMENT_MAP.put(PaymentType.BANK_TRANSFER,BankTransferPayment::new);
        PAYMENT_MAP.put(PaymentType.CREDIT_CARD,CreditCardPayment::new);
        PAYMENT_MAP.put(PaymentType.PAYPAL,PaypalPayment::new);
    }

    public static Payment createPayment(PaymentType paymentType)
    {
        Supplier<Payment> paymentSupplier=PAYMENT_MAP.get(paymentType);

        if(paymentSupplier==null)
        {
            throw new IllegalArgumentException("Geçersiz Ödeme Tipi : "+paymentType);
        }
        return paymentSupplier.get();
    }

}

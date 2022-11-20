package ua.edu.ucu.apps.flowerstore.payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.flowerstore.payments.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payments.PayPalPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payments.Payment;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/payments")
public class PaymentController {
    @GetMapping
    public List<? extends Payment> getPaymentMethods() {
        Payment payPalPayment = new PayPalPaymentStrategy();
        Payment creditCardPayment = new CreditCardPaymentStrategy();
        payPalPayment.setBalance(100);
        creditCardPayment.setBalance(150);
        return List.of(payPalPayment, creditCardPayment);
    }
}

package ua.edu.ucu.apps.flowerstore.payments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayPalPaymentStrategy implements Payment {
    private double balance = 0;

    @Override
    public boolean pay(double price) {
        if (price <= this.balance) {
            balance = this.balance - price;
        }
        return price <= this.balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

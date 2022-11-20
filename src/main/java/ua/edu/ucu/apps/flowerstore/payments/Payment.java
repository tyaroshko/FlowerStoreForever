package ua.edu.ucu.apps.flowerstore.payments;

public interface Payment {
    double balance = 0;

    boolean pay(double price);

    void setBalance(double balance);
}


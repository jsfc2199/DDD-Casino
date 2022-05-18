package co.com.sofka.player.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.Payment;

public class PaymentAdded extends DomainEvent {
    private final Payment payment;

    public PaymentAdded(Payment payment) {
        super("sofka.player.paymentadded");
        this.payment=payment;
    }

    public Payment getPayment() {
        return payment;
    }
}

package co.com.sofka.player.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.Name;
import co.com.sofka.player.values.Payment;

public class PlayerCreated extends DomainEvent {
    private final Name name;
    private final Payment payment;

    public PlayerCreated(Payment payment, Name name) {
        super("sofka.player.playercreated");
        this.name = name;
        this.payment = payment;
    }

    public Name getName() {
        return name;
    }

    public Payment getPayment() {
        return payment;
    }
}

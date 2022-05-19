package co.com.sofka.poker.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.poker.values.DealerId;
import co.com.sofka.poker.values.Name;

public class DealerNameUpdated extends DomainEvent {
    private final DealerId dealerId;
    private final Name dealerName;

    public DealerNameUpdated(DealerId dealerId, Name name) {
        super("sofka.poker.updatedealername");
        this.dealerId = dealerId;
        this.dealerName = name;
    }

    public DealerId getDealerId() {
        return dealerId;
    }

    public Name getDealerName() {
        return dealerName;
    }
}

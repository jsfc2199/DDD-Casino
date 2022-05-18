package co.com.sofka.poker;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.poker.values.DealerId;

public class Dealer extends Entity<DealerId> {
    public Dealer(DealerId entityId) {
        super(entityId);
    }
}

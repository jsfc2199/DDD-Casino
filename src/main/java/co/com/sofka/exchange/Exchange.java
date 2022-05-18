package co.com.sofka.exchange;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.exchange.values.ExchangeId;

public class Exchange extends Entity<ExchangeId> {
    public Exchange(ExchangeId entityId) {
        super(entityId);
    }
}

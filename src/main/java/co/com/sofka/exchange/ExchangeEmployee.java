package co.com.sofka.exchange;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.exchange.values.ExchangeEmployeeId;

public class ExchangeEmployee extends Entity<ExchangeEmployeeId> {
    public ExchangeEmployee(ExchangeEmployeeId entityId) {
        super(entityId);
    }
}

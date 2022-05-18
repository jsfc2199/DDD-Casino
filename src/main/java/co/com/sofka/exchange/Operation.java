package co.com.sofka.exchange;

import co.com.sofka.domain.generic.AggregateRoot;
import co.com.sofka.exchange.values.ExchangeAmount;
import co.com.sofka.exchange.values.OperationId;

public class Operation extends AggregateRoot<OperationId> {
    public Operation(OperationId entityId, ExchangeAmount exchangeAmount) {
        super(entityId);
    }
}

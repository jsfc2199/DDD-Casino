package co.com.sofka.exchange.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.exchange.values.Amount;
import co.com.sofka.exchange.values.OperationId;

public class OperationAmountAdded extends DomainEvent {
    private final OperationId operationId;
    private final Amount amount;

    public OperationAmountAdded(OperationId operationId, Amount amount) {
        super("sofka.exchange.operationamountadded");
        this.operationId = operationId;
        this.amount = amount;
    }

    public OperationId getOperationId() {
        return operationId;
    }

    public Amount getAmount() {
        return amount;
    }
}

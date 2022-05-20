package co.com.sofka.exchange.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.exchange.values.ChipValue;
import co.com.sofka.exchange.values.OperationId;
import co.com.sofka.exchange.values.Type;

public class OperationTypeUpdated extends DomainEvent {
    private final OperationId operationId;
    private final Type type;

    public OperationTypeUpdated(OperationId operationId, Type type) {
        super("sofka.exchange.operationtypeupdated");
        this.operationId = operationId;
        this.type = type;
    }

    public OperationId getOperationId() {
        return operationId;
    }

    public Type getType() {
        return type;
    }
}

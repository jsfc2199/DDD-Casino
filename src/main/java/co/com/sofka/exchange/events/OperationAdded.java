package co.com.sofka.exchange.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.exchange.values.*;

public class OperationAdded extends DomainEvent {
    private final OperationId operationId;
    private final ChipValue chipValue;
    private final Type type;
    private final Amount amount;

    public OperationAdded(OperationId operationId, ChipValue chipValue, Type type1, Amount amount) {
        super("sofka.exchange.operationadded");
        this.operationId = operationId;
        this.chipValue = chipValue;
        this.type = type1;
        this.amount = amount;
    }

    public OperationId getOperationId() {
        return operationId;
    }

    public ChipValue getChipValue() {
        return chipValue;
    }

    public Type getType() {
        return type;
    }

    public Amount getAmount() {
        return amount;
    }
}

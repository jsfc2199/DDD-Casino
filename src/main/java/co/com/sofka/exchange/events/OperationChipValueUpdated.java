package co.com.sofka.exchange.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.exchange.values.ChipValue;
import co.com.sofka.exchange.values.OperationId;

public class OperationChipValueUpdated extends DomainEvent {
    private final OperationId operationId;
    private final ChipValue chipValue;

    public OperationChipValueUpdated(OperationId operationId, ChipValue chipValue) {
        super("sofka.exchange.operationchipvalueupdated");
        this.operationId = operationId;
        this.chipValue = chipValue;
    }

    public OperationId getOperationId() {
        return operationId;
    }

    public ChipValue getChipValue() {
        return chipValue;
    }
}

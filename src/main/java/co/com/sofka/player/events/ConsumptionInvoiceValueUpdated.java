package co.com.sofka.player.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.ConsumptionInvoiceId;
import co.com.sofka.player.values.Value;

public class ConsumptionInvoiceValueUpdated extends DomainEvent {
    private final ConsumptionInvoiceId consumptionInvoiceId;
    private final Value valueInvoice;

    public ConsumptionInvoiceValueUpdated(ConsumptionInvoiceId entityId, Value value) {
        super("sofka.player.consumptioninvoicevalueupdated");
        this.consumptionInvoiceId = entityId;
        this.valueInvoice = value;
    }

    public ConsumptionInvoiceId getConsumptionInvoiceId() {
        return consumptionInvoiceId;
    }

    public Value getValueInvoice() {
        return valueInvoice;
    }
}

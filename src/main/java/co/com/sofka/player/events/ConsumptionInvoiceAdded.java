package co.com.sofka.player.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.ConsumptionInvoiceId;
import co.com.sofka.player.values.Item;
import co.com.sofka.player.values.Value;

public class ConsumptionInvoiceAdded extends DomainEvent {
    private final ConsumptionInvoiceId consumptionInvoiceId;
    private final Item item;
    private final Value valueInvoice;

    public ConsumptionInvoiceAdded(ConsumptionInvoiceId entityId, Item item, Value value) {
        super("sofka.player.consumptioninvoiceadded");
        this.consumptionInvoiceId = entityId;
        this.item = item;
        this.valueInvoice = value;
    }


    public ConsumptionInvoiceId getConsumptionInvoiceId() {
        return consumptionInvoiceId;
    }

    public Item getItem() {
        return item;
    }

    public Value getValueInvoice() {
        return valueInvoice;
    }
}

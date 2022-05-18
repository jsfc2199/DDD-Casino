package co.com.sofka.player.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.ConsumptionInvoiceId;
import co.com.sofka.player.values.Item;


public class ConsumptionInvoiceItemAdded extends DomainEvent {
    private final ConsumptionInvoiceId consumptionInvoiceId;
    private final Item item;

    public ConsumptionInvoiceItemAdded(ConsumptionInvoiceId entityId, Item item) {
        super("sofka.player.consumptioninvoiceitemadded");
        this.consumptionInvoiceId = entityId;
        this.item = item;
    }

    public ConsumptionInvoiceId getConsumptionInvoiceId() {
        return consumptionInvoiceId;
    }

    public Item getItem() {
        return item;
    }
}

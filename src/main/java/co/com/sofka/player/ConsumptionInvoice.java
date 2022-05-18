package co.com.sofka.player;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.player.values.ConsumptionInvoiceId;
import co.com.sofka.player.values.Item;
import co.com.sofka.player.values.Value;

public class ConsumptionInvoice extends Entity<ConsumptionInvoiceId> {
    private final Value value;
    private final Item item;

    public ConsumptionInvoice(ConsumptionInvoiceId entityId, Item item, Value value) {
        super(entityId);
        this.item=item;
        this.value=value;
    }

    public Value invoiceValue() {
        return value;
    }

    public Item item() {
        return item;
    }
}

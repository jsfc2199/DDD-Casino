package co.com.sofka.player;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.player.values.ConsumptionInvoiceId;
import co.com.sofka.player.values.Item;
import co.com.sofka.player.values.Value;

import java.util.Objects;

public class ConsumptionInvoice extends Entity<ConsumptionInvoiceId> {
    private Value value;
    private Item item;

    public ConsumptionInvoice(ConsumptionInvoiceId entityId, Item item, Value value) {
        super(entityId);
        this.item=item;
        this.value=value;
    }

    //behaviors
    public void updateValue(Value value){
        this.value = Objects.requireNonNull(value);
    }

    public void addItem(Item item){
        this.item = Objects.requireNonNull(item);
    }

    public Value invoiceValue() {
        return value;
    }

    public Item item() {
        return item;
    }
}

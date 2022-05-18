package co.com.sofka.player;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.player.values.ConsumptionInvoiceId;
import co.com.sofka.player.values.Item;
import co.com.sofka.player.values.Value;

import java.util.List;
import java.util.Objects;

public class ConsumptionInvoice extends Entity<ConsumptionInvoiceId> {
    private Value value;
    private List<Item> item;

    public ConsumptionInvoice(ConsumptionInvoiceId entityId, List<Item> item, Value value) {
        super(entityId);
        this.item=item;
        this.value=value;
    }

    //behaviors
    public void updateValue(Value value){
        this.value = Objects.requireNonNull(value);
    }

    public void addItem(Item item){
        this.item.add(Objects.requireNonNull(item));
    }


//getter
    public Value invoiceValue() {
        return value;
    }

    public List<Item> item() {
        return item;
    }
}

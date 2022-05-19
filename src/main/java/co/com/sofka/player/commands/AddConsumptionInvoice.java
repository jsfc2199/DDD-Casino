package co.com.sofka.player.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.player.values.ConsumptionInvoiceId;
import co.com.sofka.player.values.Item;
import co.com.sofka.player.values.PlayerId;
import co.com.sofka.player.values.Value;

public class AddConsumptionInvoice extends Command {
    private final PlayerId playerId;
    private final ConsumptionInvoiceId consumptionInvoiceId;
    private final Item item;
    private final Value valueInvoice;

    public AddConsumptionInvoice(PlayerId playerId, ConsumptionInvoiceId consumptionInvoiceId, Item item, Value value) {
        this.playerId = playerId;
        this.consumptionInvoiceId = consumptionInvoiceId;
        this.item = item;
        this.valueInvoice = value;
    }

    public PlayerId getPlayerId() {
        return playerId;
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

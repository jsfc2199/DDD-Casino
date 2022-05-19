package co.com.sofka.player.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.player.values.ConsumptionInvoiceId;
import co.com.sofka.player.values.Item;
import co.com.sofka.player.values.PlayerId;

public class AddConsumptionInvoiceItem extends Command {
    private final PlayerId playerId;
    private final ConsumptionInvoiceId consumptionInvoiceId;
    private final Item item;

    public AddConsumptionInvoiceItem(PlayerId playerId, ConsumptionInvoiceId entityId, Item item) {
        this.playerId = playerId;
        this.consumptionInvoiceId = entityId;
        this.item = item;
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
}

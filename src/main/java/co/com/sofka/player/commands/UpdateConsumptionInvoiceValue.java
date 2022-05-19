package co.com.sofka.player.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.player.values.ConsumptionInvoiceId;
import co.com.sofka.player.values.PlayerId;
import co.com.sofka.player.values.Value;

public class UpdateConsumptionInvoiceValue extends Command {
    private final PlayerId playerId;
    private final ConsumptionInvoiceId entityId;
    private final Value value;

    public UpdateConsumptionInvoiceValue(PlayerId playerId, ConsumptionInvoiceId entityId, Value value) {
        this.playerId = playerId;
        this.entityId = entityId;
        this.value = value;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }

    public ConsumptionInvoiceId getConsumptionEntityId() {
        return entityId;
    }

    public Value getConsumptionValue() {
        return value;
    }
}

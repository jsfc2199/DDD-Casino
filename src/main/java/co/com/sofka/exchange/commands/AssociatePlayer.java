package co.com.sofka.exchange.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.exchange.values.ExchangeId;
import co.com.sofka.player.values.PlayerId;

public class AssociatePlayer extends Command {
    private final ExchangeId exchangeId;
    private final PlayerId playerId;

    public AssociatePlayer(ExchangeId exchangeId, PlayerId playerId) {
        this.exchangeId = exchangeId;
        this.playerId = playerId;
    }

    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }
}

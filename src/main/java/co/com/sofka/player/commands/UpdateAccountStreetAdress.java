package co.com.sofka.player.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.player.values.AccountId;
import co.com.sofka.player.values.PlayerId;
import co.com.sofka.player.values.StreetAdress;

public class UpdateAccountStreetAdress extends Command {
    private final PlayerId playerId;
    private final AccountId entityId;
    private final StreetAdress streetAdress;

    public UpdateAccountStreetAdress(PlayerId playerId, AccountId entityId, StreetAdress streetAdress) {
        this.playerId = playerId;
        this.entityId = entityId;
        this.streetAdress = streetAdress;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }

    public AccountId getAccountEntityId() {
        return entityId;
    }

    public StreetAdress getStreetAdress() {
        return streetAdress;
    }
}

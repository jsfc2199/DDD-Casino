package co.com.sofka.player.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.player.values.AccountId;
import co.com.sofka.player.values.Email;
import co.com.sofka.player.values.PlayerId;

public class UpdateAccountEmail extends Command {
    private final PlayerId playerId;
    private final AccountId entityId;
    private final Email email;

    public UpdateAccountEmail(PlayerId playerId, AccountId entityId, Email email) {
        this.playerId = playerId;
        this.entityId = entityId;
        this.email = email;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }

    public AccountId getAccountEntityId() {
        return entityId;
    }

    public Email getEmail() {
        return email;
    }
}

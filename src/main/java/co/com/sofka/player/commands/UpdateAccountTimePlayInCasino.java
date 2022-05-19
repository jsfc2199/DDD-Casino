package co.com.sofka.player.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.player.values.AccountId;
import co.com.sofka.player.values.PlayerId;
import co.com.sofka.player.values.TimePlayInCasino;

public class UpdateAccountTimePlayInCasino extends Command {
    private final PlayerId playerId;
    private final AccountId entityId;
    private final TimePlayInCasino timePlayInCasino;

    public UpdateAccountTimePlayInCasino(PlayerId playerId, AccountId entityId, TimePlayInCasino timePlayInCasino) {
        this.playerId = playerId;
        this.entityId = entityId;
        this.timePlayInCasino = timePlayInCasino;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }

    public AccountId getAccountEntityId() {
        return entityId;
    }

    public TimePlayInCasino getTimePlayInCasino() {
        return timePlayInCasino;
    }
}

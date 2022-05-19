package co.com.sofka.player.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.player.values.*;

public class AddAccount extends Command {
    private final PlayerId playerId;

    private final AccountId accountId;
    private final Email email;
    private final StreetAdress streetAdress;
    private final TimePlayInCasino timePlayInCasino;

    public AddAccount(PlayerId playerId, AccountId entityId, Email email, StreetAdress streetAdress, TimePlayInCasino timePlayInCasino) {
        this.playerId = playerId;
        this.accountId = entityId;
        this.email = email;
        this.streetAdress = streetAdress;
        this.timePlayInCasino = timePlayInCasino;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public Email getEmail() {
        return email;
    }

    public StreetAdress getStreetAdress() {
        return streetAdress;
    }

    public TimePlayInCasino getTimePlayInCasino() {
        return timePlayInCasino;
    }
}

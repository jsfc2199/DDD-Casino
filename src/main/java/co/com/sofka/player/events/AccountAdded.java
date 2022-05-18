package co.com.sofka.player.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.AccountId;
import co.com.sofka.player.values.Email;
import co.com.sofka.player.values.StreetAdress;
import co.com.sofka.player.values.TimePlayInCasino;

public class AccountAdded extends DomainEvent {
    private final AccountId accountId;
    private final Email email;
    private final StreetAdress streetAdress;
    private final TimePlayInCasino timePlayInCasino;

    public AccountAdded(AccountId entityId, Email email, StreetAdress streetAdress, TimePlayInCasino timePlayInCasino) {
        super("sofka.player.accountadded");
        this.accountId = entityId;
        this.email = email;
        this.streetAdress = streetAdress;
        this.timePlayInCasino = timePlayInCasino;
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

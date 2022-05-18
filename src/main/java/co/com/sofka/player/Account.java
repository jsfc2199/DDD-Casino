package co.com.sofka.player;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.player.values.AccountId;
import co.com.sofka.player.values.Email;
import co.com.sofka.player.values.StreetAdress;
import co.com.sofka.player.values.TimePlayInCasino;

public class Account extends Entity<AccountId> {
    private final Email email;
    private final StreetAdress streetAdress;
    private final TimePlayInCasino timePlayInCasino;

    public Account(AccountId entityId, Email email, StreetAdress streetAdress, TimePlayInCasino timePlayInCasino) {
        super(entityId);
        this.email=email;
        this.streetAdress=streetAdress;
        this.timePlayInCasino=timePlayInCasino;
    }

    public Email email() {
        return email;
    }

    public StreetAdress streetAdress() {
        return streetAdress;
    }

    public TimePlayInCasino timePlayInCasino() {
        return timePlayInCasino;
    }
}

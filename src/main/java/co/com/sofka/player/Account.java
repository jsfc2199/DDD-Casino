package co.com.sofka.player;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.player.values.AccountId;
import co.com.sofka.player.values.Email;
import co.com.sofka.player.values.StreetAdress;
import co.com.sofka.player.values.TimePlayInCasino;

import java.util.Objects;

public class Account extends Entity<AccountId> {
    private Email email;
    private StreetAdress streetAdress;
    private TimePlayInCasino timePlayInCasino;

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

    public void updateEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }

    public void updateStreetAdress(StreetAdress streetAdress){
        this.streetAdress = Objects.requireNonNull(streetAdress);
    }

    public void updateTimePlayInCasino(TimePlayInCasino timePlayInCasino){
        this.timePlayInCasino = Objects.requireNonNull(timePlayInCasino);
    }
}

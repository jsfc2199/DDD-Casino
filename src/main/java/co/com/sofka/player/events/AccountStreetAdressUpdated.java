package co.com.sofka.player.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.AccountId;
import co.com.sofka.player.values.StreetAdress;

public class AccountStreetAdressUpdated extends DomainEvent {
    private final AccountId accountId;
    private final StreetAdress streetAdress;

    public AccountStreetAdressUpdated(AccountId entityId, StreetAdress streetAdress) {
        super("sofka.player.accountstreetadressupdated");
        this.accountId = entityId;
        this.streetAdress = streetAdress;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public StreetAdress getStreetAdress() {
        return streetAdress;
    }
}

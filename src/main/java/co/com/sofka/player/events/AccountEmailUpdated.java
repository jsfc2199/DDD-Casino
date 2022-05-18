package co.com.sofka.player.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.AccountId;
import co.com.sofka.player.values.Email;

public class AccountEmailUpdated extends DomainEvent {
    private final AccountId accountId;
    private final Email email;

    public AccountEmailUpdated(AccountId entityId, Email email) {
        super("sofka.player.accountemailupdated");
        this.accountId = entityId;
        this.email = email;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public Email getEmail() {
        return email;
    }
}

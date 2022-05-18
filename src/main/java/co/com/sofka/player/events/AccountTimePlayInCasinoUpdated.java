package co.com.sofka.player.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.AccountId;
import co.com.sofka.player.values.TimePlayInCasino;

public class AccountTimePlayInCasinoUpdated extends DomainEvent {
    private final AccountId accountId;
    private final TimePlayInCasino timePlayInCasino;

    public AccountTimePlayInCasinoUpdated(AccountId entityId, TimePlayInCasino timePlayInCasino) {
        super("sofka.player.accounttimeplayincasinoupdated");
        this.accountId=entityId;
        this.timePlayInCasino = timePlayInCasino;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public TimePlayInCasino getTimePlayInCasino() {
        return timePlayInCasino;
    }
}

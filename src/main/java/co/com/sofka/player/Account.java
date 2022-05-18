package co.com.sofka.player;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.player.values.AccountId;

public class Account extends Entity<AccountId> {
    public Account(AccountId entityId) {
        super(entityId);
    }
}

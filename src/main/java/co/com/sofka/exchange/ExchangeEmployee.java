package co.com.sofka.exchange;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.exchange.values.CashFunds;
import co.com.sofka.exchange.values.Chip;
import co.com.sofka.exchange.values.ExchangeEmployeeId;
import co.com.sofka.exchange.values.Name;

public class ExchangeEmployee extends Entity<ExchangeEmployeeId> {
    private final Name name;
    private final CashFunds cashFunds;
    private final Chip chip;

    public ExchangeEmployee(ExchangeEmployeeId entityId, Name name, CashFunds cashFunds, Chip chip) {
        super(entityId);
        this.name=name;
        this.cashFunds=cashFunds;
        this.chip=chip;
    }

    public Name name() {
        return name;
    }

    public CashFunds cashFunds() {
        return cashFunds;
    }

    public Chip chip() {
        return chip;
    }
}

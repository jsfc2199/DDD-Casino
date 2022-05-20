package co.com.sofka.exchange.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.exchange.values.*;
import co.com.sofka.exchange.values.ExchangeEmployeeId;

public class ExchangeEmployeeAdded extends DomainEvent {
    private final ExchangeEmployeeId exchangeEmployeeId;
    private final Name employeeName;
    private final Chip chip;
    private final CashFunds cashFunds;

    public ExchangeEmployeeAdded(ExchangeEmployeeId exchangeEmployeeId, Name employeeName, Chip chip, CashFunds cashFunds) {
        super("sofka.exchange.echangeemployeeadded");
        this.exchangeEmployeeId = exchangeEmployeeId;
        this.employeeName = employeeName;
        this.chip = chip;
        this.cashFunds = cashFunds;
    }

    public ExchangeEmployeeId getExchangeEmployeeId() {
        return exchangeEmployeeId;
    }

    public Name getEmployeeName() {
        return employeeName;
    }

    public Chip getChip() {
        return chip;
    }

    public CashFunds getCashFunds() {
        return cashFunds;
    }
}

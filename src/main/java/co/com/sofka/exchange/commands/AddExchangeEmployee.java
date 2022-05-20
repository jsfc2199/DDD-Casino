package co.com.sofka.exchange.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.exchange.values.*;
import co.com.sofka.exchange.values.ExchangeEmployeeId;
import co.com.sofka.exchange.values.ExchangeId;

public class AddExchangeEmployee extends Command {
    private final ExchangeId exchangeId;
    private final ExchangeEmployeeId exchangeEmployeeId;
    private final Name name;
    private final Chip chip;
    private final CashFunds cashFunds;

    public AddExchangeEmployee(ExchangeId exchangeId, ExchangeEmployeeId exchangeEmployeeId, Name name, Chip chip, CashFunds cashFunds) {
        this.exchangeId = exchangeId;
        this.exchangeEmployeeId = exchangeEmployeeId;
        this.name = name;
        this.chip = chip;
        this.cashFunds = cashFunds;
    }

    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    public ExchangeEmployeeId getExchangeEmployeeId() {
        return exchangeEmployeeId;
    }

    public Name getName() {
        return name;
    }

    public Chip getChip() {
        return chip;
    }

    public CashFunds getCashFunds() {
        return cashFunds;
    }
}

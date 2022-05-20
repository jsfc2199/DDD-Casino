package co.com.sofka.exchange.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.exchange.values.Chip;
import co.com.sofka.exchange.values.ExchangeEmployeeId;
import co.com.sofka.exchange.values.ExchangeId;

public class AddEchangeEmployeeChip extends Command {
    private final ExchangeId exchangeId;
    private final ExchangeEmployeeId exchangeEmployeeId;
    private final Chip chip;

    public AddEchangeEmployeeChip(ExchangeId exchangeId, ExchangeEmployeeId exchangeEmployeeId, Chip chip) {
        this.exchangeId = exchangeId;
        this.exchangeEmployeeId = exchangeEmployeeId;
        this.chip = chip;
    }

    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    public ExchangeEmployeeId getExchangeEmployeeId() {
        return exchangeEmployeeId;
    }

    public Chip getChip() {
        return chip;
    }
}

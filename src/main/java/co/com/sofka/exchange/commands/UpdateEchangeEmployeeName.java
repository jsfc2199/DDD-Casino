package co.com.sofka.exchange.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.exchange.values.ExchangeEmployeeId;
import co.com.sofka.exchange.values.ExchangeId;
import co.com.sofka.exchange.values.Name;

public class UpdateEchangeEmployeeName extends Command {
    private final ExchangeId exchangeId;
    private final ExchangeEmployeeId exchangeEmployeeId;
    private final Name name;

    public UpdateEchangeEmployeeName(ExchangeId exchangeId, ExchangeEmployeeId exchangeEmployeeId, Name name) {
        this.exchangeId = exchangeId;
        this.exchangeEmployeeId = exchangeEmployeeId;
        this.name = name;
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
}

package co.com.sofka.exchange.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.exchange.values.ExchangeAmount;
import co.com.sofka.exchange.values.ExchangeId;

public class CreateExchange extends Command {
    private final ExchangeId exchangeId;
    private final ExchangeAmount exchangeAmount;

    public CreateExchange(ExchangeId exchangeId, ExchangeAmount exchangeAmount) {
        this.exchangeId = exchangeId;
        this.exchangeAmount = exchangeAmount;
    }

    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    public ExchangeAmount getExchangeAmount() {
        return exchangeAmount;
    }
}

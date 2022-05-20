package co.com.sofka.exchange.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.exchange.values.ExchangeAmount;

public class ExchangeAmountAdded extends DomainEvent {
    private final ExchangeAmount exchangeAmount;

    public ExchangeAmountAdded(ExchangeAmount exchangeAmount) {
        super("sofka.exchange.exchangeamountadded");
        this.exchangeAmount = exchangeAmount;
    }

    public ExchangeAmount getExchangeAmount() {
        return exchangeAmount;
    }
}

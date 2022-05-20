package co.com.sofka.exchange.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.exchange.values.ExchangeAmount;

public class ExchangeCreated extends DomainEvent {
    private final ExchangeAmount exchangeAmount;
    public ExchangeCreated(ExchangeAmount exchangeAmount) {
        super("sofka.exchange.exchangecreated");
        this.exchangeAmount = exchangeAmount;
    }

    public ExchangeAmount getExchangeAmount() {
        return exchangeAmount;
    }
}

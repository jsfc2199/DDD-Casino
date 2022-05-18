package co.com.sofka.exchange;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.exchange.values.ExchangeAmount;
import co.com.sofka.exchange.values.ExchangeId;
import co.com.sofka.player.values.PlayerId;

public class Exchange extends AggregateEvent<ExchangeId> {
    protected ExchangeAmount exchangeAmount;
    protected PlayerId playerId;
    protected ExchangeEmployee exchangeEmployee;
    protected Operation operation;

    public Exchange(ExchangeId entityId, ExchangeAmount exchangeAmount) {
        super(entityId);
    }
}

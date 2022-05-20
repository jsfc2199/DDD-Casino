package co.com.sofka.exchange.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.exchange.values.Chip;
import co.com.sofka.exchange.values.ExchangeEmployeeId;
import co.com.sofka.exchange.values.Name;

public class ExchangeEmployeeChipAdded extends DomainEvent {
    private final ExchangeEmployeeId exchangeEmployeeId;
    private final Chip chip;

    public ExchangeEmployeeChipAdded(ExchangeEmployeeId exchangeEmployeeId, Chip chip) {
        super("sofka.exchange.exchangeemployeechipadded");
        this.exchangeEmployeeId = exchangeEmployeeId;
        this.chip = chip;
    }

    public ExchangeEmployeeId getExchangeEmployeeId() {
        return exchangeEmployeeId;
    }

    public Chip getChip() {
        return chip;
    }
}

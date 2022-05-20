package co.com.sofka.exchange.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.exchange.values.ExchangeEmployeeId;
import co.com.sofka.exchange.values.Name;

public class ExchangeEmployeeNameUpdated extends DomainEvent {
    private final ExchangeEmployeeId exchangeEmployeeId;
    private final Name employeeName;

    public ExchangeEmployeeNameUpdated(ExchangeEmployeeId exchangeEmployeeId, Name employeeName) {
        super("sofka.exchange.echangeemployeenameupdated");
        this.exchangeEmployeeId = exchangeEmployeeId;
        this.employeeName = employeeName;
    }

    public ExchangeEmployeeId getExchangeEmployeeId() {
        return exchangeEmployeeId;
    }

    public Name getEmployeeName() {
        return employeeName;
    }
}

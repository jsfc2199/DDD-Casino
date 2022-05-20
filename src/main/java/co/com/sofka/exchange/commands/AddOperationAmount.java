package co.com.sofka.exchange.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.exchange.values.Amount;
import co.com.sofka.exchange.values.ExchangeId;
import co.com.sofka.exchange.values.OperationId;

public class AddOperationAmount extends Command {
    private final ExchangeId exchangeId;
    private final OperationId operationId;
    private final Amount amount;

    public AddOperationAmount(ExchangeId exchangeId, OperationId operationId, Amount amount) {
        this.exchangeId = exchangeId;
        this.operationId = operationId;
        this.amount = amount;
    }

    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    public OperationId getOperationId() {
        return operationId;
    }

    public Amount getAmount() {
        return amount;
    }
}

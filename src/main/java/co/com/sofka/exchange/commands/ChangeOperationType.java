package co.com.sofka.exchange.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.exchange.values.ExchangeId;
import co.com.sofka.exchange.values.OperationId;
import co.com.sofka.exchange.values.Type;

public class ChangeOperationType extends Command {
    private final ExchangeId exchangeId;
    private final OperationId operationId;
    private final Type type;

    public ChangeOperationType(ExchangeId exchangeId, OperationId operationId, Type type) {
        this.exchangeId = exchangeId;
        this.operationId = operationId;
        this.type = type;
    }

    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    public OperationId getOperationId() {
        return operationId;
    }

    public Type getType() {
        return type;
    }
}

package co.com.sofka.exchange.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.exchange.values.ExchangeId;
import co.com.sofka.exchange.values.OperationId;
import co.com.sofka.exchange.values.*;

public class AddOperation extends Command {
    private final ExchangeId exchangeId;
    private final OperationId operationId;
    private final ChipValue chipValue;
    private final Type type;
    private final Amount amount;

    public AddOperation(ExchangeId exchangeId, OperationId operationId, ChipValue chipValue, Type type, Amount amount) {
        this.exchangeId = exchangeId;
        this.operationId = operationId;
        this.chipValue = chipValue;
        this.type = type;
        this.amount = amount;
    }

    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    public OperationId getOperationId() {
        return operationId;
    }

    public ChipValue getChipValue() {
        return chipValue;
    }

    public Type getType() {
        return type;
    }

    public Amount getAmount() {
        return amount;
    }
}

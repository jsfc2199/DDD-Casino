package co.com.sofka.exchange.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.exchange.values.ChipValue;
import co.com.sofka.exchange.values.ExchangeId;
import co.com.sofka.exchange.values.OperationId;

public class UpdateOperationChipValue extends Command {
    private final ExchangeId exchangeId;
    private final OperationId operationId;
    private final ChipValue chipValue;

    public UpdateOperationChipValue(ExchangeId exchangeId, OperationId operationId, ChipValue chipValue) {
        this.exchangeId = exchangeId;
        this.operationId = operationId;
        this.chipValue = chipValue;
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
}

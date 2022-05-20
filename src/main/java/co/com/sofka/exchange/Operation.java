package co.com.sofka.exchange;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.exchange.values.Amount;
import co.com.sofka.exchange.values.ChipValue;
import co.com.sofka.exchange.values.OperationId;
import co.com.sofka.exchange.values.Type;

import java.util.Objects;

public class Operation extends Entity<OperationId> {
    private ChipValue chipValue;
    private Type type;
    private Amount amount;

    public Operation(OperationId entityId, ChipValue chipValue, Type type, Amount amount) {
        super(entityId);
        this.chipValue=chipValue;
        this.type=type;
        this.amount=amount;
    }

    public ChipValue chipValue() {
        return chipValue;
    }

    public Type type() {
        return type;
    }

    public Amount amount() {
        return amount;
    }

    public void updateChipValue(ChipValue chipValue){
        this.chipValue = Objects.requireNonNull(chipValue);
    }

    public void changeType(Type type){
        this.type = Objects.requireNonNull(type);
    }

    public void addAmount(Amount amount){
        this.amount = Objects.requireNonNull(amount);
    }
}

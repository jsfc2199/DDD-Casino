package co.com.sofka.exchange;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.exchange.events.*;
import co.com.sofka.exchange.values.*;
import co.com.sofka.player.values.PlayerId;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Exchange extends AggregateEvent<ExchangeId> {
    protected ExchangeAmount exchangeAmount;
    protected PlayerId playerId;
    protected Set<ExchangeEmployee> exchangeEmployees;
    protected Set<Operation> operations;

    public Exchange(ExchangeId entityId, ExchangeAmount exchangeAmount) {
        super(entityId);
        appendChange(new ExchangeCreated(exchangeAmount));
    }

    private Exchange(ExchangeId entityId){
        super(entityId);
        subscribe(new ExchangeChange(this));
    }

    public static Exchange from(ExchangeId exchangeId, List<DomainEvent> events){
        var exchange= new Exchange(exchangeId);
        events.forEach(exchange::applyEvent);
        return exchange;
    }

    //behaviors
    public void addExchangeAmount(ExchangeAmount exchangeAmount){
        Objects.requireNonNull(exchangeAmount);
        appendChange(new ExchangeAmountAdded(exchangeAmount)).apply();
    }

    public void addExchangeEmployee(ExchangeEmployeeId exchangeEmployeeId, Name name, Chip chip, CashFunds cashFunds){
        Objects.requireNonNull(exchangeEmployeeId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(chip);
        Objects.requireNonNull(cashFunds);
        appendChange(new ExchangeEmployeeAdded(exchangeEmployeeId, name, chip, cashFunds)).apply();
    }

    public void updateEchangeEmployeeName(ExchangeEmployeeId exchangeEmployeeId, Name name){
        Objects.requireNonNull(exchangeEmployeeId);
        Objects.requireNonNull(name);
        appendChange(new ExchangeEmployeeNameUpdated(exchangeEmployeeId, name)).apply();
    }

    public void addEchangeEmployeeChip(ExchangeEmployeeId exchangeEmployeeId, Chip chip){
        Objects.requireNonNull(exchangeEmployeeId);
        Objects.requireNonNull(chip);
        appendChange(new ExchangeEmployeeChipAdded(exchangeEmployeeId,chip)).apply();
    }

    public void addOperation(OperationId operationId, ChipValue chipValue, Type type, Amount amount){
        Objects.requireNonNull(operationId);
        Objects.requireNonNull(chipValue);
        Objects.requireNonNull(type);
        Objects.requireNonNull(amount);
        appendChange(new OperationAdded(operationId,chipValue,type,amount)).apply();
    }

    public void updateOperationChipValue(OperationId operationId, ChipValue chipValue){
        Objects.requireNonNull(operationId);
        Objects.requireNonNull(chipValue);
        appendChange(new OperationChipValueUpdated(operationId,chipValue)).apply();
    }

    public void changeOperationType(OperationId operationId, Type type){
        Objects.requireNonNull(operationId);
        Objects.requireNonNull(type);
        appendChange(new OperationTypeUpdated(operationId,type)).apply();
    }

    public void addOperationAmount(OperationId operationId, Amount amount){
        Objects.requireNonNull(operationId);
        Objects.requireNonNull(amount);
        appendChange(new OperationAmountAdded(operationId,amount)).apply();
    }

    public void associatePlayer(PlayerId playerId){
        Objects.requireNonNull(playerId);
        appendChange(new PlayerAssociated(playerId)).apply();
    }

    public Optional<ExchangeEmployee> getEmployeeById(ExchangeEmployeeId exchangeEmployeeId){
        return exchangeEmployees().stream().filter(employee->employee.identity().equals(exchangeEmployeeId)).findFirst();
    }

    public Optional<Operation> getOperationById(OperationId operationId){
        return operations().stream().filter(operation->operation.identity().equals(operationId)).findFirst();
    }

    public ExchangeAmount exchangeAmount() {
        return exchangeAmount;
    }

    public PlayerId playerId() {
        return playerId;
    }

    public Set<ExchangeEmployee> exchangeEmployees() {
        return exchangeEmployees;
    }

    public Set<Operation> operations() {
        return operations;
    }
}

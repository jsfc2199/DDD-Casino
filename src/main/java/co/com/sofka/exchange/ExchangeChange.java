package co.com.sofka.exchange;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.exchange.events.*;

import java.util.HashSet;

public class ExchangeChange extends EventChange {
    public ExchangeChange(Exchange exchange) {
        apply((ExchangeCreated event) -> {
            exchange.exchangeAmount = event.getExchangeAmount();
            exchange.exchangeEmployees = new HashSet<>();
            exchange.operations = new HashSet<>();
        });

        apply((ExchangeAmountAdded event) -> {
            exchange.exchangeAmount = event.getExchangeAmount();
        });

        apply((ExchangeEmployeeAdded event) -> {
            if (exchange.exchangeEmployees().size() > 60) {
                throw new IllegalArgumentException("We can't hire more employees");
            }
            exchange.exchangeEmployees.add(new ExchangeEmployee(event.getExchangeEmployeeId(), event.getEmployeeName(), event.getCashFunds(), event.getChip()));
        });

        apply((ExchangeEmployeeChipAdded event)->{
            var chipsToAdd = exchange.getEmployeeById(event.getExchangeEmployeeId())
                .orElseThrow(()->new IllegalArgumentException("Wrong it to reach the employee"));
            chipsToAdd.addChip(event.getChip());
        });

        apply((ExchangeEmployeeNameUpdated event)->{
            var nameToUpdate = exchange.getEmployeeById(event.getExchangeEmployeeId())
                    .orElseThrow(()->new IllegalArgumentException("Wrong it to reach the employee"));
            nameToUpdate.updateEmployeeName(event.getEmployeeName());
        });

        apply((OperationAdded event)->{
            if(exchange.operations().size()>10){
                throw new IllegalArgumentException("We can't only convert the money in 10 differentes types of operation");
            }

            exchange.operations.add(new Operation(event.getOperationId(), event.getChipValue(), event.getType(), event.getAmount()));
        });

        apply((OperationAmountAdded event)->{
            var amountToAdd = exchange.getOperationById(event.getOperationId())
                    .orElseThrow(()->new IllegalArgumentException("Wrong id to reach the operation"));
            amountToAdd.addAmount(event.getAmount());
        });

        apply((OperationChipValueUpdated event)->{
            var chipToUpdate = exchange.getOperationById(event.getOperationId())
                    .orElseThrow(()->new IllegalArgumentException("Wrong id to reach the operation"));
            chipToUpdate.updateChipValue(event.getChipValue());
        });

        apply((OperationTypeUpdated event)->{
            var typeToUpdate = exchange.getOperationById(event.getOperationId())
                    .orElseThrow(()->new IllegalArgumentException("Wrong id to reach the operation"));
            typeToUpdate.changeType(event.getType());
        });

        apply((PlayerAssociated event)->{
            exchange.playerId = event.getPlayerId();
        });
    }
}

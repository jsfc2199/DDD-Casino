package co.com.sofka.exchange;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.exchange.values.CashFunds;
import co.com.sofka.exchange.values.Chip;
import co.com.sofka.exchange.values.ExchangeEmployeeId;
import co.com.sofka.exchange.values.Name;

import java.util.Objects;

public class ExchangeEmployee extends Entity<ExchangeEmployeeId> {
    private Name employeeName;
    private CashFunds cashFunds;
    private Chip chip;

    public ExchangeEmployee(ExchangeEmployeeId entityId, Name name, CashFunds cashFunds, Chip chip) {
        super(entityId);
        this.employeeName=name;
        this.cashFunds=cashFunds;
        this.chip=chip;
    }

    public Name name() {
        return employeeName;
    }

    public CashFunds cashFunds() {
        return cashFunds;
    }

    public Chip chip() {
        return chip;
    }

    public void updateEmployeeName(Name name){
        this.employeeName = Objects.requireNonNull(name);
    }

    public void addChip(Chip chip){
        this.chip = chip;
    }
}

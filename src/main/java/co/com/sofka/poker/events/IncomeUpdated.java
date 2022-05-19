package co.com.sofka.poker.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.poker.values.Income;

public class IncomeUpdated extends DomainEvent {
    private final Income income;

    public IncomeUpdated(Income income) {
        super("sofka.poker.incomeupdated");
        this.income = income;
    }

    public Income getIncome() {
        return income;
    }
}

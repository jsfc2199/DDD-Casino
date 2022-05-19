package co.com.sofka.poker.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.poker.values.Income;

public class PokerCreated extends DomainEvent {
    private final Income income;

    public PokerCreated(Income income) {
        super("sofka.poker.pokercreated");
        this.income = income;
    }

    public Income getIncome() {
        return income;
    }
}

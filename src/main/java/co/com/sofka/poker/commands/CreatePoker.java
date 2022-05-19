package co.com.sofka.poker.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.poker.values.Income;
import co.com.sofka.poker.values.PokerId;

public class CreatePoker extends Command {
    private final PokerId pokerId;
    private final Income income;

    public CreatePoker(PokerId entityId, Income income) {
        this.pokerId = entityId;
        this.income = income;
    }

    public PokerId getPokerId() {
        return pokerId;
    }

    public Income getIncome() {
        return income;
    }
}

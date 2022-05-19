package co.com.sofka.poker.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.poker.values.Income;
import co.com.sofka.poker.values.PokerId;

public class UpdateIncome extends Command {
    private final PokerId pokerId;
    private final Income income;

    public UpdateIncome(PokerId pokerId, Income income) {
        this.pokerId = pokerId;
        this.income = income;
    }

    public PokerId getPokerId() {
        return pokerId;
    }

    public Income getIncome() {
        return income;
    }
}

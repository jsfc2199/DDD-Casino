package co.com.sofka.poker.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.poker.values.DealerId;
import co.com.sofka.poker.values.Name;
import co.com.sofka.poker.values.PokerId;
import co.com.sofka.poker.values.YearsOfExperience;

public class AddDealer extends Command {
    private final PokerId pokerId;
    private final DealerId dealerId;
    private final Name dealerName;
    private final YearsOfExperience yearsOfExperience;

    public AddDealer(PokerId pokerId, DealerId dealerId, Name name, YearsOfExperience yearsOfExperience) {
        this.pokerId = pokerId;
        this.dealerId = dealerId;
        this.dealerName = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public PokerId getPokerId() {
        return pokerId;
    }

    public DealerId getDealerId() {
        return dealerId;
    }

    public Name getDealerName() {
        return dealerName;
    }

    public YearsOfExperience getYearsOfExperience() {
        return yearsOfExperience;
    }
}

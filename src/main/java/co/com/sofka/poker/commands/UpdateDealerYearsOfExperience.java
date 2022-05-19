package co.com.sofka.poker.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.poker.values.DealerId;
import co.com.sofka.poker.values.PokerId;
import co.com.sofka.poker.values.YearsOfExperience;

public class UpdateDealerYearsOfExperience extends Command {
    private final PokerId pokerId;
    private final DealerId dealerId;
    private final YearsOfExperience yearsOfExperience;

    public UpdateDealerYearsOfExperience(PokerId pokerId, DealerId dealerId, YearsOfExperience yearsOfExperience) {
        this.pokerId = pokerId;
        this.dealerId = dealerId;
        this.yearsOfExperience = yearsOfExperience;
    }

    public PokerId getPokerId() {
        return pokerId;
    }

    public DealerId getDealerId() {
        return dealerId;
    }

    public YearsOfExperience getYearsOfExperience() {
        return yearsOfExperience;
    }
}

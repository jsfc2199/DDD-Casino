package co.com.sofka.poker.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.poker.values.DealerId;
import co.com.sofka.poker.values.Name;
import co.com.sofka.poker.values.PokerId;

public class UpdateDealerName extends Command {
    private final PokerId pokerId;
    private final DealerId dealerId;
    private final Name dealerName;

    public UpdateDealerName(PokerId pokerId, DealerId dealerId, Name dealerName) {
        this.pokerId = pokerId;
        this.dealerId = dealerId;
        this.dealerName = dealerName;
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
}

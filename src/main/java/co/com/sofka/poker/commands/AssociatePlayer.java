package co.com.sofka.poker.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.player.values.PlayerId;
import co.com.sofka.poker.values.PokerId;

public class AssociatePlayer extends Command {
    private final PokerId pokerId;
    private final PlayerId playerPokerId;

    public AssociatePlayer(PokerId pokerId, PlayerId playerId) {
        this.pokerId = pokerId;
        this.playerPokerId = playerId;
    }

    public PokerId getPokerId() {
        return pokerId;
    }

    public PlayerId getPlayerPokerId() {
        return playerPokerId;
    }
}

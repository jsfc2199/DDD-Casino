package co.com.sofka.player.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.player.values.Name;
import co.com.sofka.player.values.PlayerId;

public class UpdateName extends Command {
    private final PlayerId playerId;
    private final Name name;

    public UpdateName(PlayerId playerId, Name name) {
        this.playerId = playerId;
        this.name = name;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }

    public Name getName() {
        return name;
    }
}

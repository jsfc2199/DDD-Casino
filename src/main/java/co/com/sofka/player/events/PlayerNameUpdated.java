package co.com.sofka.player.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.Name;

public class PlayerNameUpdated extends DomainEvent {
    private final Name name;
    public PlayerNameUpdated(Name name) {
        super("sofka.player.playernameupdated");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}

package co.com.sofka.poker.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.PlayerId;

public class PlayerAssociated extends DomainEvent {
    private final PlayerId playerTableId;
    public PlayerAssociated(PlayerId playerId) {
        super("sofka.poker.playerassociated");
        this.playerTableId=playerId;
    }

    public PlayerId getPlayerTableId() {
        return playerTableId;
    }
}

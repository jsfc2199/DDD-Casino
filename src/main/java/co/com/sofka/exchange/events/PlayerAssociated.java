package co.com.sofka.exchange.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.PlayerId;

public class PlayerAssociated extends DomainEvent {
    private final PlayerId playerId;

    public PlayerAssociated(PlayerId playerId) {
        super("sofka.exhange.playerassociated");
        this.playerId = playerId;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }
}

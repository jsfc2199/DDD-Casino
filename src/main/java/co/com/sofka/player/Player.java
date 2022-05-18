package co.com.sofka.player;

import co.com.sofka.domain.generic.AggregateRoot;
import co.com.sofka.player.values.PlayerId;

public class Player extends AggregateRoot<PlayerId> {
    public Player(PlayerId entityId) {
        super(entityId);
    }
}

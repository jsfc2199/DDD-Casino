package co.com.sofka.poker;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.player.values.PlayerId;
import co.com.sofka.poker.values.Income;
import co.com.sofka.poker.values.PokerId;

import java.util.Set;

public class Poker extends AggregateEvent<PokerId> {
    protected Set<PlayerId> players;
    protected Income income;
    protected Dealer dealer;
    protected Table table;

    public Poker(PokerId entityId, Income income) {
        super(entityId);
    }
}

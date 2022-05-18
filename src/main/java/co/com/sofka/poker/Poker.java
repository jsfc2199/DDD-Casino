package co.com.sofka.poker;

import co.com.sofka.domain.generic.AggregateRoot;
import co.com.sofka.poker.values.Income;
import co.com.sofka.poker.values.PokerId;

public class Poker extends AggregateRoot<PokerId> {
    public Poker(PokerId entityId, Income income) {
        super(entityId);
    }
}

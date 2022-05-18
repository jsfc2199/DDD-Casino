package co.com.sofka.poker;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.poker.values.ChairsNumber;
import co.com.sofka.poker.values.Deck;
import co.com.sofka.poker.values.TableId;

public class Table extends Entity<TableId> {
    private final Deck deck;
    private final ChairsNumber chairsNumber;

    public Table(TableId entityId, Deck deck, ChairsNumber chairsNumber) {
        super(entityId);
        this.deck=deck;
        this.chairsNumber = chairsNumber;
    }

    public Deck deck() {
        return deck;
    }

    public ChairsNumber chairsNumber() {
        return chairsNumber;
    }
}

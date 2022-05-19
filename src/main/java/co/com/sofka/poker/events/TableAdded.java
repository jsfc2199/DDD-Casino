package co.com.sofka.poker.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.poker.values.ChairsNumber;
import co.com.sofka.poker.values.Deck;
import co.com.sofka.poker.values.TableId;

public class TableAdded extends DomainEvent {
    private final TableId tableId;
    private final Deck deck;
    private final ChairsNumber chairsNumber;

    public TableAdded(TableId tableId, Deck deck, ChairsNumber chairsNumber) {
        super("sofka.poker.tableadded");
        this.tableId = tableId;
        this.deck = deck;
        this.chairsNumber = chairsNumber;
    }

    public TableId getTableId() {
        return tableId;
    }

    public Deck getDeck() {
        return deck;
    }

    public ChairsNumber getChairsNumber() {
        return chairsNumber;
    }
}

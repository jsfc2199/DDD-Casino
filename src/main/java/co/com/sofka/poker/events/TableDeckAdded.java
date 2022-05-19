package co.com.sofka.poker.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.poker.values.Deck;
import co.com.sofka.poker.values.TableId;

public class TableDeckAdded extends DomainEvent {
    private final TableId tableId;
    private final Deck deck;

    public TableDeckAdded(TableId tableId, Deck deck) {
        super("sofka.poker.tabledeckadded");
        this.tableId = tableId;
        this.deck = deck;
    }

    public TableId getTableId() {
        return tableId;
    }

    public Deck getDeck() {
        return deck;
    }
}

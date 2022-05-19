package co.com.sofka.poker.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.poker.values.Deck;
import co.com.sofka.poker.values.PokerId;
import co.com.sofka.poker.values.TableId;

public class AddTableDeck extends Command {
    private final PokerId pokerId;
    private final TableId tableId;
    private final Deck deck;

    public AddTableDeck(PokerId pokerId, TableId tableId, Deck deck) {
        this.pokerId = pokerId;
        this.tableId = tableId;
        this.deck = deck;
    }

    public PokerId getPokerId() {
        return pokerId;
    }

    public TableId getTableId() {
        return tableId;
    }

    public Deck getDeck() {
        return deck;
    }
}

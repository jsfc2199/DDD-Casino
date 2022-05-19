package co.com.sofka.poker.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.poker.values.ChairsNumber;
import co.com.sofka.poker.values.Deck;
import co.com.sofka.poker.values.PokerId;
import co.com.sofka.poker.values.TableId;

public class AddTable extends Command {
    private final PokerId pokerId;
    private final TableId tableId;
    private final Deck deck;
    private final ChairsNumber chairsNumber;

    public AddTable(PokerId pokerId, TableId tableId, Deck deck, ChairsNumber chairsNumber) {
        this.pokerId = pokerId;
        this.tableId = tableId;
        this.deck = deck;
        this.chairsNumber = chairsNumber;
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

    public ChairsNumber getChairsNumber() {
        return chairsNumber;
    }
}

package co.com.sofka.poker;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.poker.values.ChairsNumber;
import co.com.sofka.poker.values.Deck;
import co.com.sofka.poker.values.TableId;

import java.util.List;
import java.util.Objects;

public class Table extends Entity<TableId> {
    private List<Deck> deck;
    private ChairsNumber chairsNumber;

    public Table(TableId entityId, List<Deck> deck, ChairsNumber chairsNumber) {
        super(entityId);
        this.deck=deck;
        this.chairsNumber = chairsNumber;
    }

    public void addDeck(Deck deck){
        this.deck.add(Objects.requireNonNull(deck));
    }

    public void updateChairsNumber(ChairsNumber chairsNumber){
        this.chairsNumber = Objects.requireNonNull(chairsNumber);
    }

    public List<Deck> deck() {
        return deck;
    }

    public ChairsNumber chairsNumber() {
        return chairsNumber;
    }
}

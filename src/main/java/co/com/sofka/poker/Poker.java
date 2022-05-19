package co.com.sofka.poker;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.player.values.PlayerId;
import co.com.sofka.poker.events.*;
import co.com.sofka.poker.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Poker extends AggregateEvent<PokerId> {
    protected Income income;
    protected PlayerId playerId;
    protected Set<Dealer> dealers;
    protected Set<Table> tables;

    public Poker(PokerId entityId, Income income) {
        super(entityId);
        appendChange(new PokerCreated(income)).apply();
    }

    private Poker(PokerId entityId){
        super(entityId);
        subscribe(new PokerChange(this));
    }

    public static Poker from(PokerId entityId, List<DomainEvent> events){
        var pokerGame = new Poker(entityId);
        events.forEach(pokerGame::applyEvent);
        return pokerGame;
    }

    public void updateIncome(Income income){
        Objects.requireNonNull(income);
        appendChange(new IncomeUpdated(income)).apply();
    }

    public void addDealer(DealerId dealerId, Name name, YearsOfExperience yearsOfExperience){
        Objects.requireNonNull(dealerId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(yearsOfExperience);
        appendChange(new DelaerAdded(dealerId,name,yearsOfExperience)).apply();
    }

    public void updateDealerName(DealerId dealerId, Name name){
        Objects.requireNonNull(dealerId);
        Objects.requireNonNull(name);
        appendChange(new DealerNameUpdated(dealerId,name)).apply();
    }

    public void updateDealerYearsOfExperience(DealerId dealerId, YearsOfExperience yearsOfExperience){
        Objects.requireNonNull(dealerId);
        Objects.requireNonNull(yearsOfExperience);
        appendChange(new DelaerYearsOfExperienceUpdated(dealerId,yearsOfExperience)).apply();
    }

    public void addTable(TableId tableId, Deck deck, ChairsNumber chairsNumber){
        Objects.requireNonNull(tableId);
        Objects.requireNonNull(deck);
        Objects.requireNonNull(chairsNumber);
        appendChange(new TableAdded(tableId,deck,chairsNumber));
    }

    public void addTableDeck(TableId tableId, Deck deck){
        Objects.requireNonNull(tableId);
        Objects.requireNonNull(deck);
        appendChange(new TableDeckAdded(tableId, deck));
    }

    public void updateTableChairsNumber(TableId tableId, ChairsNumber chairsNumber){
        Objects.requireNonNull(tableId);
        Objects.requireNonNull(chairsNumber);
        appendChange(new TableChairsNumberUpdated(tableId,chairsNumber));
    }

    public void associatePlayer(PlayerId playerId){
        appendChange(new PlayerAssociated(playerId)).apply();
    }

    public Optional<Dealer> getDealerById(DealerId dealerId){
        return dealers().stream().filter(dealer -> dealer.identity().equals(dealerId)).findFirst();
    }

    public Optional<Table> getTableById(TableId tableId){
        return tables().stream().filter(table -> table.identity().equals(tableId)).findFirst();
    }

    public Income income() {
        return income;
    }

    public PlayerId player_Id() {
        return playerId;
    }

    public Set<Dealer> dealers() {
        return dealers;
    }

    public Set<Table> tables() {
        return tables;
    }
}

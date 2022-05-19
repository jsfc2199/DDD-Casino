package co.com.sofka.poker;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.poker.events.*;
import co.com.sofka.poker.values.Deck;

import java.util.HashSet;
import java.util.List;

public class PokerChange extends EventChange {

    public PokerChange (Poker poker){

        apply((PokerCreated event) ->{
            poker.income = event.getIncome();
            poker.dealers = new HashSet<>();
            poker.tables = new HashSet<>();
        });

        apply((DealerNameUpdated event) ->{
            var name = poker.getDealerById(event.getDealerId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the dealer"));
            name.updateDealerName(event.getDealerName());
        });

        apply((DelaerAdded event) ->{
            var numberOfDealers = poker.dealers().size();
            if(numberOfDealers>2){
                throw new IllegalArgumentException("The max amount of dealers is 2");
            }
            poker.dealers.add(new Dealer(event.getDealerId(), event.getDealerName(), event.getYearsOfExperience()));
        });

        apply((DelaerYearsOfExperienceUpdated event)->{
           var yearsOfExperience = poker.getDealerById(event.getDealerId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the dealer"));
           yearsOfExperience.updateDealerYearsOfExperience(event.getYearsOfExperience());
        });

        apply((IncomeUpdated event)->{
            poker.income = event.getIncome();
        });

        apply((PlayerAssociated event) ->{
            poker.playerId = event.getPlayerTableId();
        });

        apply((TableAdded event) ->{
            if(poker.tables().size()>1){
                throw new IllegalArgumentException("The max amount of tables per game is 1");
            }
            poker.tables.add(new Table(event.getTableId(), (List<Deck>) event.getDeck(), event.getChairsNumber()));
        });

        apply((TableChairsNumberUpdated event)->{
            var chairsNumber = poker.getTableById(event.getTableId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the table"));
            chairsNumber.updateChairsNumber(event.getChairsNumber());
        });

        apply((TableDeckAdded event) ->{
            var deckAdded = poker.getTableById(event.getTableId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the table"));
            deckAdded.addDeck(event.getDeck());
        });
    }
}

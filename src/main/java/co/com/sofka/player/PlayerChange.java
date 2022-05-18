package co.com.sofka.player;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.player.events.*;
import co.com.sofka.player.values.Item;

import java.util.HashSet;
import java.util.List;


public class PlayerChange extends EventChange {
    public PlayerChange(Player player){

        apply((PlayerCreated event)-> {
            player.name = event.getName();
            player.payment = event.getPayment();
            player.accounts = new HashSet<>();
            player.consumptionInvoices = new HashSet<>();
        });

        apply((AccountAdded event) -> {
            var numberOfAccounts = player.accounts().size();
            if (numberOfAccounts > 1){
                throw new IllegalArgumentException("The player can only have one account");
            }
            player.accounts.add(new Account(event.getAccountId(), event.getEmail(), event.getStreetAdress(), event.getTimePlayInCasino()));
        });

        apply((AccountEmailUpdated event) ->{
            var email = player.getAccountById(event.getAccountId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the account"));
            email.updateEmail(event.getEmail());
        });

        apply((AccountStreetAdressUpdated event) ->{
            var streetAdress = player.getAccountById(event.getAccountId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the account"));
            streetAdress.updateStreetAdress(event.getStreetAdress());
        });

        apply((AccountTimePlayInCasinoUpdated event)->{
            var timePlayInCasino = player.getAccountById(event.getAccountId()).orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the account"));
            timePlayInCasino.updateTimePlayInCasino(event.getTimePlayInCasino());
        });

        apply((ConsumptionInvoiceAdded event) ->{
            player.consumptionInvoices.add(new ConsumptionInvoice(event.getConsumptionInvoiceId(), (List<Item>) event.getItem(), event.getValueInvoice()));
        });

        apply((ConsumptionInvoiceItemAdded event) ->{
            var itemAdded = player.getConsumptionInvoiceById(event.getConsumptionInvoiceId())
                    .orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the consumption invoice"));
            itemAdded.addItem(event.getItem());
        });

        apply((ConsumptionInvoiceValueUpdated event) ->{
            var valueUpdated = player.getConsumptionInvoiceById(event.getConsumptionInvoiceId())
                    .orElseThrow(()-> new IllegalArgumentException("Wrong Id to reach the consumption invoice"));
            valueUpdated.updateValue(event.getValueInvoice());
        });

        apply((PaymentAdded event) ->{
            player.payment = event.getPayment();
        });

        apply((PlayerNameUpdated event) ->{
            player.name = event.getName();
        });


    }
}

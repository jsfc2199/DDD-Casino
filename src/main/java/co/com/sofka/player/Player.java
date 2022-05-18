package co.com.sofka.player;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.player.events.*;
import co.com.sofka.player.values.*;

import java.util.Objects;

public class Player extends AggregateEvent<PlayerId> {
    protected Name name;
    protected Payment payment;
    protected ConsumptionInvoice consumptionInvoice;
    protected Account account;


    public Player(PlayerId entityId, Payment payment, Name name) {
        super(entityId);
        appendChange(new PlayerCreated(payment, name)).apply();
    }

    //behaviors
    public void addPayment(Payment payment){
        Objects.requireNonNull(payment);
        appendChange(new PaymentAdded(payment)).apply();
    }

    public void updateName(Name name){
        Objects.requireNonNull(name);
        appendChange(new PlayerNameUpdated(name)).apply();
    }

    public void addConsumptionInvoice(ConsumptionInvoiceId entityId, Item item, Value value){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(item);
        Objects.requireNonNull(value);
        appendChange(new ConsumptionInvoiceAdded(entityId, item, value)).apply();
    }

    public void addConsumptionInvoiceItem(ConsumptionInvoiceId entityId, Item item){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(item);
        appendChange(new ConsumptionInvoiceItemAdded(entityId,item)).apply();
    }

    public void updateConsumptionInvoiceValue(ConsumptionInvoiceId entityId,Value value){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(value);
        appendChange(new ConsumptionInvoiceValueUpdated(entityId, value)).apply();
    }

    public void addAccount(AccountId entityId, Email email, StreetAdress streetAdress, TimePlayInCasino timePlayInCasino){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);
        Objects.requireNonNull(streetAdress);
        Objects.requireNonNull(timePlayInCasino);
        appendChange(new AccountAdded(entityId,email,streetAdress,timePlayInCasino)).apply();
    }

    public void updateAccountEmail(AccountId entityId, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);
        appendChange(new AccountEmailUpdated(entityId,email)).apply();
    }

    public void updateAccountStreetAdress(AccountId entityId, StreetAdress streetAdress){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(streetAdress);
        appendChange(new AccountStreetAdressUpdated(entityId,streetAdress)).apply();
    }

    public void updateAccountTimePlayInCasino(AccountId entityId, TimePlayInCasino timePlayInCasino){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(timePlayInCasino);
        appendChange(new AccountTimePlayInCasinoUpdated(entityId,timePlayInCasino)).apply();
    }

    //properties

    public Name name() {
        return name;
    }

    public Payment payment() {
        return payment;
    }

    public ConsumptionInvoice consumptionInvoice() {
        return consumptionInvoice;
    }

    public Account account() {
        return account;
    }
}

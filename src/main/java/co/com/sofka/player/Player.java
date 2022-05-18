package co.com.sofka.player;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.player.events.PlayerCreated;
import co.com.sofka.player.values.Name;
import co.com.sofka.player.values.Payment;
import co.com.sofka.player.values.PlayerId;

public class Player extends AggregateEvent<PlayerId> {
    protected Name name;
    protected Payment payment;
    protected ConsumptionInvoice consumptionInvoice;
    protected Account account;


    public Player(PlayerId entityId, Payment payment, Name name) {
        super(entityId);
        appendChange(new PlayerCreated(payment, name)).apply();
    }
}

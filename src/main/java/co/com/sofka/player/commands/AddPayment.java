package co.com.sofka.player.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.player.values.Payment;
import co.com.sofka.player.values.PlayerId;

public class AddPayment extends Command {
    private final PlayerId playerId;
    private final Payment payment;

    public AddPayment(PlayerId playerId, Payment payment) {
        this.playerId = playerId;
        this.payment = payment;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }

    public Payment getPayment() {
        return payment;
    }
}

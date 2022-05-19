package co.com.sofka.player.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.player.values.Name;
import co.com.sofka.player.values.Payment;
import co.com.sofka.player.values.PlayerId;

public class CreatePlayer extends Command {
    private final PlayerId playerId;
    private final Payment payment;
    private final Name playerName;

    public CreatePlayer(PlayerId entityId, Payment payment, Name name) {
        this.playerId = entityId;
        this.payment = payment;
        this.playerName = name;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }

    public Payment getPayment() {
        return payment;
    }

    public Name getPlayerName() {
        return playerName;
    }
}

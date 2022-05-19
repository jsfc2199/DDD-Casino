package co.com.sofka.poker.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.player.values.AccountId;

public class PokerId extends Identity {

    public PokerId(){

    }

    private PokerId(String id){
        super(id);
    }

    //build the identifier
    public static PokerId of(String id){
        return new PokerId(id);
    }
}

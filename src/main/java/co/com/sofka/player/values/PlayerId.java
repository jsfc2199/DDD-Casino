package co.com.sofka.player.values;

import co.com.sofka.domain.generic.Identity;

public class PlayerId extends Identity {

    public PlayerId(){

    }

    private PlayerId(String id){
        super(id);
    }

    //build the identifier
    public static PlayerId of(String id){
        return new PlayerId(id);
    }


}

package co.com.sofka.poker.values;

import co.com.sofka.domain.generic.Identity;

public class DealerId extends Identity {

    public DealerId(){

    }

    private DealerId(String id){
        super(id);
    }

    //build the identifier
    public static DealerId of(String id){
        return new DealerId(id);
    }
}

package co.com.sofka.player.values;

import co.com.sofka.domain.generic.Identity;

public class AccountId extends Identity {

    public AccountId(){

    }

    private AccountId(String id){
        super(id);
    }

    //build the identifier
    public static AccountId of(String id){
        return new AccountId(id);
    }
}

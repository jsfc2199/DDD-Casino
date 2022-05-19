package co.com.sofka.poker.values;

import co.com.sofka.domain.generic.Identity;

public class TableId extends Identity {
    public TableId(){

    }

    private TableId(String id){
        super(id);
    }

    //build the identifier
    public static TableId of(String id){
        return new TableId(id);
    }
}

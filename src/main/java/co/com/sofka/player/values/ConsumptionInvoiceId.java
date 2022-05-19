package co.com.sofka.player.values;

import co.com.sofka.domain.generic.Identity;

public class ConsumptionInvoiceId extends Identity {
    public ConsumptionInvoiceId(){

    }

    private ConsumptionInvoiceId(String id){
        super(id);
    }

    //build the identifier
    public static ConsumptionInvoiceId of(String id){
        return new ConsumptionInvoiceId(id);
    }
}

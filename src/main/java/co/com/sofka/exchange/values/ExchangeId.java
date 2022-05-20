package co.com.sofka.exchange.values;

import co.com.sofka.domain.generic.Identity;

public class ExchangeId extends Identity {

    private ExchangeId(String uuid) {
        super(uuid);
    }

    public ExchangeId() {
    }

    public static ExchangeId of(String uuid){
        return new ExchangeId(uuid);
    }
}

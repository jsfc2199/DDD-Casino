package co.com.sofka.exchange.values;

import co.com.sofka.domain.generic.Identity;

public class ExchangeEmployeeId extends Identity {

    private ExchangeEmployeeId(String uuid) {
        super(uuid);
    }

    public ExchangeEmployeeId() {
    }

    public static ExchangeEmployeeId of(String uuid){
        return new ExchangeEmployeeId(uuid);
    }
}

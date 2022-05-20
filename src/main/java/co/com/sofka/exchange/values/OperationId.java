package co.com.sofka.exchange.values;

import co.com.sofka.domain.generic.Identity;

public class OperationId extends Identity {
    private OperationId(String uuid) {
        super(uuid);
    }

    public OperationId() {
    }

    public static OperationId of(String uuid){
        return new OperationId(uuid);
    }
}

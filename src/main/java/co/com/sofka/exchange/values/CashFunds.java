package co.com.sofka.exchange.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CashFunds implements ValueObject<Integer> {
    private final Integer value;

    public CashFunds(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("The casu funds can't be negative");
        }
    }
    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CashFunds)) return false;
        CashFunds cashFunds = (CashFunds) o;
        return Objects.equals(value, cashFunds.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

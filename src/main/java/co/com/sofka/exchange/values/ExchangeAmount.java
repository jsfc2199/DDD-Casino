package co.com.sofka.exchange.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ExchangeAmount implements ValueObject<Integer> {
    private final Integer value;

    public ExchangeAmount(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("The exchange amount can't be negative");
        }
    }
    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExchangeAmount)) return false;
        ExchangeAmount that = (ExchangeAmount) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

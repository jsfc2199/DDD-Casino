package co.com.sofka.exchange.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ChipValue implements ValueObject<Integer> {
    private final Integer value;

    public ChipValue(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("The chip value can't be negative");
        }
    }
    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChipValue)) return false;
        ChipValue chipValue = (ChipValue) o;
        return Objects.equals(value, chipValue.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

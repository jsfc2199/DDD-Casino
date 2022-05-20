package co.com.sofka.exchange.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Chip implements ValueObject<Integer> {

    private final Integer value;

    public Chip(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("The chip can't be negative");
        }
    }
    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chip)) return false;
        Chip chip = (Chip) o;
        return Objects.equals(value, chip.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

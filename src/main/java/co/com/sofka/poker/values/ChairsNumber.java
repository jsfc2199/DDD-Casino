package co.com.sofka.poker.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ChairsNumber implements ValueObject<Integer> {
    private final Integer value;

    public ChairsNumber(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChairsNumber)) return false;
        ChairsNumber that = (ChairsNumber) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

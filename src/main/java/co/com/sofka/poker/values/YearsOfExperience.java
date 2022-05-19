package co.com.sofka.poker.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class YearsOfExperience implements ValueObject<Integer> {
    private final Integer value;

    public YearsOfExperience(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YearsOfExperience)) return false;
        YearsOfExperience that = (YearsOfExperience) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

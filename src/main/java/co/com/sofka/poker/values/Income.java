package co.com.sofka.poker.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Income implements ValueObject<Integer> {
    private final Integer value;

    public Income(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Income)) return false;
        Income income = (Income) o;
        return Objects.equals(value, income.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

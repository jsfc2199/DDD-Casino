package co.com.sofka.player.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TimePlayInCasino implements ValueObject<Integer> {
    private final Integer value;

    public TimePlayInCasino(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TimePlayInCasino)) return false;
        TimePlayInCasino that = (TimePlayInCasino) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

package co.com.sofka.poker;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.poker.values.DealerId;
import co.com.sofka.poker.values.Name;
import co.com.sofka.poker.values.YearsOfExperience;

public class Dealer extends Entity<DealerId> {
    private final Name name;
    private final YearsOfExperience yearsOfExperience;

    public Dealer(DealerId entityId, Name name, YearsOfExperience yearsOfExperience) {
        super(entityId);
        this.name = name;
        this.yearsOfExperience=yearsOfExperience;
    }

    public Name name() {
        return name;
    }

    public YearsOfExperience yearsOfExperience() {
        return yearsOfExperience;
    }
}

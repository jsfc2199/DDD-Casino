package co.com.sofka.poker.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.poker.values.DealerId;
import co.com.sofka.poker.values.Name;
import co.com.sofka.poker.values.YearsOfExperience;

public class DelaerAdded extends DomainEvent {
    private final DealerId dealerId;
    private final Name dealerName;
    private final YearsOfExperience yearsOfExperience;

    public DelaerAdded(DealerId dealerId, Name name, YearsOfExperience yearsOfExperience) {
        super("sofka.poker.delaeradded");
        this.dealerId = dealerId;
        this.dealerName = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public DealerId getDealerId() {
        return dealerId;
    }

    public Name getDealerName() {
        return dealerName;
    }

    public YearsOfExperience getYearsOfExperience() {
        return yearsOfExperience;
    }
}

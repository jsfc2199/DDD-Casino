package co.com.sofka.poker.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.poker.values.DealerId;
import co.com.sofka.poker.values.YearsOfExperience;

public class DelaerYearsOfExperienceUpdated extends DomainEvent {
    private final DealerId dealerId;
    private final YearsOfExperience yearsOfExperience;

    public DelaerYearsOfExperienceUpdated(DealerId dealerId, YearsOfExperience yearsOfExperience) {
        super("sofka.poker.delaeryearsofexperienceupdated");
        this.dealerId = dealerId;
        this.yearsOfExperience = yearsOfExperience;
    }

    public DealerId getDealerId() {
        return dealerId;
    }

    public YearsOfExperience getYearsOfExperience() {
        return yearsOfExperience;
    }
}

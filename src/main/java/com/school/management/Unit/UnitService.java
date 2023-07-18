package com.school.management.Unit;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitService {

    private final UnitRepository unitRepository;

    public UnitService(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

//    get a list of units
    public List<Unit> getUnits() {
        return unitRepository.findAll();
    }

//    add a new unit
    public Unit getUnit(Long unitId) {
        return unitRepository.findById(unitId)
                .orElseThrow(() -> new IllegalStateException("Unit with id " + unitId + " does not exist")
                );
    }

//    add a new unit
    public Unit addUnit(Unit unit) {
        return unitRepository.save(unit);
    }
}

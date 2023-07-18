package com.school.management.Unit;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/units")
public class UnitController {

    private final UnitService unitService;

    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }

    @GetMapping("/all")
    public List<Unit> allUnits() {
        return unitService.getUnits();
    }

    @GetMapping("/{unitId}")
    Unit getUnit(@PathVariable Long unitId) {
        return unitService.getUnit(unitId);
    }

    @PostMapping("/add")
    Unit addUnit(@RequestBody Unit unit) {
        return unitService.addUnit(unit);
    }
}

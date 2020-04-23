package com.codegym.Service.NationService;

import com.codegym.Entity.Nation;

import java.util.List;

public interface INationService {
    List<Nation> getAllNation();
    Nation addNation(Nation nation);
    Nation findNationById(Long id);
    Nation updateNation(Nation nation);
    void removeNation(Nation nation);
}

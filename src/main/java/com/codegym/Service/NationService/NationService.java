package com.codegym.Service.NationService;

import com.codegym.Entity.Nation;
import com.codegym.Repository.NationRepository.INationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NationService implements INationService{
    @Autowired
    INationRepository nationRepository;
    @Override
    public List<Nation> getAllNation() {
        return (List<Nation>) nationRepository.findAll();
    }

    @Override
    public Nation addNation(Nation nation) {
        return nationRepository.save(nation);
    }

    @Override
    public Nation findNationById(Long id) {
        return nationRepository.findOne(id);
    }

    @Override
    public Nation updateNation(Nation nation) {
        return nationRepository.save(nation);
    }

    @Override
    public void removeNation(Nation nation) {
        nationRepository.delete(nation);
    }


}

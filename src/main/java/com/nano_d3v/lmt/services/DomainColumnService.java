package com.nano_d3v.lmt.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.nano_d3v.lmt.api.models.DomainColumn;
import com.nano_d3v.lmt.api.repositories.DomainColumnRepository;

@Service
public class DomainColumnService {

    public final DomainColumnRepository domainColumnRepository;

    public DomainColumnService(DomainColumnRepository domainColumnRepository) {
        this.domainColumnRepository = domainColumnRepository;
    }
    
    public List<DomainColumn> getAllColumns(){
        return domainColumnRepository.findAll();
    }

    public void addDomainColumn(String name) {
        DomainColumn domainColumn = new DomainColumn(name);
        domainColumnRepository.save(domainColumn);
    }
}
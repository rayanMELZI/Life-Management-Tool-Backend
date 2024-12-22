package com.nano_d3v.lmt.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nano_d3v.lmt.api.models.DomainColumn;
import com.nano_d3v.lmt.services.DomainColumnService;

@RestController
@RequestMapping("/api/domainColumn")
public class DomainColumnController {

    public final DomainColumnService domainColumnService;

    public DomainColumnController(DomainColumnService domainColumnService) {
        this.domainColumnService = domainColumnService;
    }

    @PostMapping("/add")
    public String addColumn(
        @RequestBody DomainColumn domainColumn
    ) {
        domainColumnService.addDomainColumn(domainColumn.getName());
        return "Column added successfully";
    }
    
    // @GetMapping("/id")
    // public DomainColumn[] getColumnById(@RequestParam Integer id) {
    //     //return all columns
    // }

    //return all columns
    @GetMapping("/all")
    public List<DomainColumn> getAllColumns() {
        List<DomainColumn> domainColumns = domainColumnService.getAllColumns();
        return domainColumns;
    }
    
    // @PutMapping
    // public void updateColumn(
    //     @RequestParam("id") Integer id,
    //     @RequestParam("name") String name
    // ) {
    //     DomainColumn column = new DomainColumn(id, name);
    //     column.setName(name);
    // }
    
    @DeleteMapping
    public String removeColumn(@RequestBody Integer id) {
        //remove column
        return "Column deleted successfully";
    }
}
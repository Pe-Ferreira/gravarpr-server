package com.gravapr.gravaprserver.controller;

import com.gravapr.gravaprserver.PersonalRecord;
import com.gravapr.gravaprserver.service.PersonalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonalRecordController {

    @Autowired
    private PersonalRecordService service;

    @GetMapping(value = "/personal-records")
    public List<PersonalRecord> getAll() {
        return this.service.getAll();
    }

    @GetMapping(value = "/personal-records/{id}")
    public PersonalRecord get(@RequestParam Integer id) {
        return this.service.get(id);
    }

    @PostMapping(value = "/personal-records")
    public ResponseEntity<PersonalRecord> savePersonalRecord(PersonalRecord pr) {
        PersonalRecord savedPr = this.service.savePersonalRecord(pr);
        return ResponseEntity.ok(savedPr);
    }
}

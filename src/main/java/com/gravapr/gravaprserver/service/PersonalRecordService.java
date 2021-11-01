package com.gravapr.gravaprserver.service;

import com.gravapr.gravaprserver.PersonalRecord;
import com.gravapr.gravaprserver.repository.PersonalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalRecordService {

    @Autowired
    private PersonalRecordRepository repository;

    public List<PersonalRecord> getAll() {
        return this.repository.findAll();
    }

    public PersonalRecord get(Integer id) {
        return this.repository.getById(id);
    }

    public PersonalRecord savePersonalRecord(PersonalRecord pr) {
        return this.repository.save(pr);
    }
}

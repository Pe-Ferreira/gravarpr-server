package com.gravapr.gravaprserver.repository;

import com.gravapr.gravaprserver.PersonalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRecordRepository extends JpaRepository<PersonalRecord, Integer> {
}

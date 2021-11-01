package com.gravapr.gravaprserver;

import com.gravapr.gravaprserver.enums.Lift;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class PersonalRecord {

    @Id
    @Column
    private Integer id;

    @Column
    private Lift lift;

    @Column
    private Integer weight;

    @Column
    private LocalDate date;

    @Column
    private String comment;

}

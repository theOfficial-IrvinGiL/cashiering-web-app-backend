package com.cashieringsystembackend.cashieringsystem.group;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Data
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String name;

    private String description;
}

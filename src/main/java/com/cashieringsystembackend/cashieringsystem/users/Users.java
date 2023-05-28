package com.cashieringsystembackend.cashieringsystem.users;

import com.cashieringsystembackend.cashieringsystem.group.Groups;
import com.cashieringsystembackend.cashieringsystem.role.Role;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String username;

    @NonNull
    private String password;

    @NonNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    @NonNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Groups groups;

}

package com.example.relations.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "users_schema", name = "t_account")
public class Account {
    @Id
    Long id;
    String name;

    @Column(name = "c_title")
    String title;

    @ManyToOne
    @JoinColumn(name = "c_users_id")
    User user;
}

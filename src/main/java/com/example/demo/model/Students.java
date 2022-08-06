package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Entity
@AllArgsConstructor
@EqualsAndHashCode
@Setter
@NoArgsConstructor
public class Students {
    @Column
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}

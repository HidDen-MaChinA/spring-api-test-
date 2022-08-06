package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 200)
    private String name;

    @ManyToOne
    @JoinColumn(name="groups_id")
    private Groups group;
}

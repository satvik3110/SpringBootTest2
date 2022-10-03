package com.example.demo.Domain;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;

@MappedSuperclass
public abstract class Model {
    @Column(name = "id", updatable = false)
    @Generated(GenerationTime.INSERT)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public Long id;

    public Long getId() {
        return id;
    }
}

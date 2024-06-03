package com.expeditors.trackservice.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;


public abstract class AbstractEntity {

    protected int id;


    public AbstractEntity() {
    }

    public AbstractEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

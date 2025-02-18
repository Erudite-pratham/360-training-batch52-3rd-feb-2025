package com.training.RelationalMapping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Post {

    @Id
    private int id;

    private String content;

    @ManyToOne
    private User user;
}

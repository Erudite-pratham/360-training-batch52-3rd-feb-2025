package com.training.RelationalMapping.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    private int id;

    private String name;

//    @OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
//    private Profile profile;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    List<Post> postList;
}

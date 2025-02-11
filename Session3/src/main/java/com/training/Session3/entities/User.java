package com.training.Session3.entities;

import jakarta.persistence.*;
import lombok.*;

//@Getter
//@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String name;

    @Column(nullable = false,unique = true)
    String email;


}

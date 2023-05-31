package com.oneToMany.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String gender;


   @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
   @JoinColumn(name="cp_fk",referencedColumnName = "id")
    private List<Product>products;

}

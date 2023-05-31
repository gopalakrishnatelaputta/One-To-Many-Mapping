package com.oneToMany.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    private int pid;
    private String productName;
    private int qty;
    private int price;


}

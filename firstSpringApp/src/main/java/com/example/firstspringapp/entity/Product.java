package com.example.firstspringapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product", schema="productmanagmentsystem")
public class Product {
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Id
int id;
@Column
String name;
@Column
double price;

}

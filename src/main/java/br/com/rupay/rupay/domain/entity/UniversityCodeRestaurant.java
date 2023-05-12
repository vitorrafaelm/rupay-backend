package br.com.rupay.rupay.domain.entity;

import javax.persistence.*;

@Entity
@Table(name="university_code_restaurant")
public class UniversityCodeRestaurant {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
}

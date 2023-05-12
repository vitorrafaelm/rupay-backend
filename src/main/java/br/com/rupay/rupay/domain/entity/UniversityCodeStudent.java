package br.com.rupay.rupay.domain.entity;

import javax.persistence.*;

@Entity
@Table(name="university_code_student")
public class UniversityCodeStudent {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
}

package br.com.rupay.rupay.domain.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="university")
public class University {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String campus;

    @CreationTimestamp
    @Column
    private Date createdAt;

    @UpdateTimestamp
    @Column
    private Date updatedAt;
}

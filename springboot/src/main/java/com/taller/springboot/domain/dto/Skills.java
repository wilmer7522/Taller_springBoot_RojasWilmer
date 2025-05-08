package com.taller.springboot.domain.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime create_at;
    private LocalDateTime update_at;

    @Column(nullable = false)
    private String iconurl;
    @Column(nullable = false)
    private String skill_name;
    private String skill_description;
}

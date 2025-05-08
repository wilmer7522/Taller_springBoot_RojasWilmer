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
public class Road_Paths {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean isactive;
    private LocalDateTime create_at;
    private LocalDateTime update_at;
    private String image_path;

    @Column(nullable = false)
    private String path_name;
    @Column(nullable = false)
    private String description;

}

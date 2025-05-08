package com.taller.springboot.domain.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Skill_Route_Path implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "road_path_id", nullable = false)
    private Road_Paths road_Paths;

    @ManyToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private Skills skills;

    private LocalDateTime create_at;
    private LocalDateTime update_at;


    
}

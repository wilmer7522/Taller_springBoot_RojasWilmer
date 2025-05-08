package com.taller.springboot.domain.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
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
public class Chapters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int numberChapter;


    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skills skills;

    private LocalDateTime create_at;
    private LocalDateTime update_at;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String cahpter_summary;
}

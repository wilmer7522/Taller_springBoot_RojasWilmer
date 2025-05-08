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
public class Media_Sub_Chapters{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    
    @ManyToOne
    @JoinColumn(name = "media_id", nullable = false)
    private Media_Types media_Types;

    @ManyToOne
    @JoinColumn(name = "subchapter_id", nullable = false)
    private SubCharters subCharters;

    private LocalDateTime created_at;
    private LocalDateTime update_at;

    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String summary;

    public Media_Sub_Chapters(){}

    public Media_Sub_Chapters(Media_Types media_Types, SubCharters subCharters, LocalDateTime created_at,
            LocalDateTime update_at, String description, String summary) {
        this.media_Types = media_Types;
        this.subCharters = subCharters;
        this.created_at = created_at;
        this.update_at = update_at;
        this.description = description;
        this.summary = summary;
    }

    
}

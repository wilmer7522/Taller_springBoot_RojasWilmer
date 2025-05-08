package com.taller.springboot.domain.dto;

import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private boolean permit_all;

    @ManyToOne
    @JoinColumn(name = "module_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Module module;

    private String http_method;
    private String name;
    private String path;



    @OneToMany(mappedBy = "operation", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Granted_Permission> granted_Permissions;


    public Operation(){}


    public Operation(int id, boolean permit_all, String http_method, String name, String path,
            List<Granted_Permission> granted_Permissions) {
        this.id = id;
        this.permit_all = permit_all;
        this.http_method = http_method;
        this.name = name;
        this.path = path;
        this.granted_Permissions = granted_Permissions;
    }

    


}

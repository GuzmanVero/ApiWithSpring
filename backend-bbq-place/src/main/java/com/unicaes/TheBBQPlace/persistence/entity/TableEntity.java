package com.unicaes.TheBBQPlace.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "mesa")
@Getter
@Setter
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_menu")
    private Integer idMenu;
    private Integer nombre;
    private String descripcion;
    private double precio;
}

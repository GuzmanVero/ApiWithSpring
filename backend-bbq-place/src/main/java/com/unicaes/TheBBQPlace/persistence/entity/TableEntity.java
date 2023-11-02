package com.unicaes.TheBBQPlace.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "mesas")
@Getter
@Setter
public class TableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mesa_id")
    private Integer idMesa;

    @Column(name = "nombre_mesa")
    private String mesa;

    private Integer capacidad;
}

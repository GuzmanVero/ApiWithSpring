package com.unicaes.TheBBQPlace.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.time.LocalTime;

@Entity
@Table(name = "reservaciones")
@Getter
@Setter
public class ReserveEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservacion")
    private Integer reserveId;

    @Column(name = "comentarios")
    private Integer comments;

    @Column(name = "fecha_reserva")
    private Date date;

    @Column(name = "hora_reserva")
    private LocalTime hour;

    @Column(name = "id_mesa")
    private Integer tableId;

    @Column(name = "id_menu")
    private String idMenu;

    @Column(name = "id_pago")
    private String idPayment;

}

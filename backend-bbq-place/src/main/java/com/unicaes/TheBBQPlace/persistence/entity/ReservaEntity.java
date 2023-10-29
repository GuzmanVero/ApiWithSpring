package com.unicaes.TheBBQPlace.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.boot.model.naming.ImplicitTenantIdColumnNameSource;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservacion")
@Getter
@Setter
public class ReservaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_reservacion")
    private Integer idReservacion;
    @Column(name = "nombre_reservacion")
    private String nombreReservacion;
    @Column(name = "hora_reservacion")
    private LocalDateTime horaReservacion;
    @Column(name = "id_mesa")
    private Integer idMesa;
    @Column(name = "id_pedido")
    private Integer idPedido;
    @Column(name = "id_categoria")
    private Integer idCategoria;

}

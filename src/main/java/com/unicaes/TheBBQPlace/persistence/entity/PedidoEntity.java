package com.unicaes.TheBBQPlace.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "mesa")
@Getter
@Setter
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_pedido")
    private Integer idPedido;
    @Column(name = "id_cliente")
    private String idCliente;
    @Column(name = "medio_pago")
    private String medioPago;
    private String estado;
}

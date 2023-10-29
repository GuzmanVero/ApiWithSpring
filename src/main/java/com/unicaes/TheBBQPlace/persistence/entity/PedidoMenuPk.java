package com.unicaes.TheBBQPlace.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Embeddable
@Getter
@Setter
public class PedidoMenuPk implements Serializable {
    @Column(name = "id_pedido")
    private Integer idPedido;

    @Column(name = "id_menu")
    private Integer idMenu;
}

package com.unicaes.TheBBQPlace.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoMenuEntity {
    @EmbeddedId
    private PedidoMenuPk id;
    private Integer cantidad;
    private Double total;

    @ManyToOne
    @MapsId("idPedido")
    @JoinColumn(name = "id_pedido", insertable = false, updatable = false)
    private PedidoEntity pedido;

    @ManyToOne
    @JoinColumn(name = "id_menu", insertable = false, updatable = false)
    private MenuEntity menu;
}

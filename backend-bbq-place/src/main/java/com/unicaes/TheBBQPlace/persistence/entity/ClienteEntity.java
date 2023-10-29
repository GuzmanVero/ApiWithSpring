package com.unicaes.TheBBQPlace.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_cliente")
    private Integer idCliente;
    //Como no se cambiara el nombre de la tabla se queda igual
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String contraseña;

}

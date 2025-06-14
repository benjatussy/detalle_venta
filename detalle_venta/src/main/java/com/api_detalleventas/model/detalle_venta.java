package com.api_detalleventas.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "detalle_ventas")
@NoArgsConstructor
@AllArgsConstructor
public class detalle_venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_venta")
    private Integer id_detalle_venta;

    @Column(name = "id_venta")
    private Integer id_venta;

    @Column(name = "id_producto")
    private Integer id_producto;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precio_unitario")
    private Double precio_unitario;





    


}

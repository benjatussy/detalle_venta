package com.api_detalleventas.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class detalle_ventadto {

    private Integer id_detalle_venta;
    private Integer id_venta;
    private Integer id_producto;
    private Integer cantidad;
    private Double precio_unitario;

}

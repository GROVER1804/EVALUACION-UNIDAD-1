package com.academiaspedropaulet.academia.modelo;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "academia_pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    @Column(name = "hora_reg", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date fechaPago;

    @JoinColumn(name = "estadoPago_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Estadopago estadoPagoId;

    @JoinColumn(name = "tipoPago_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tipopago tipoPagoId;
    @JoinColumn(name = "periodo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Periodo periodoId;
    @JoinColumn(name = "estudiante_id",referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Estudiante estudianteId;
    @JoinColumn(name = "Asunto_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Asunto asuntoId;

}

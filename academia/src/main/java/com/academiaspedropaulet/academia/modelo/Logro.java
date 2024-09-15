package com.academiaspedropaulet.academia.modelo;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "academia_logro")
public class Logro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titulo", length = 100,nullable = false)
    private String titulo;
    @Column(name = "descripcion", length = 500,nullable = false)
    private String descripcion;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Basic(optional = false)
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Lob // Indica que es un objeto de gran tamaño para imagenes
    private byte[] imagen;

    @JoinColumn(name = "institucion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Institucion institucionId;
}

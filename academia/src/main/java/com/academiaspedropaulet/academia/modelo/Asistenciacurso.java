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
@Table(name = "academia_Asistenciacurso")
public class Asistenciacurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    @Column(name = "fecha_asistencia", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date fechaAsistencia;

    @JoinColumn(name = "estadoAsistencia_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Estadoasistencia estadoAsistenciaId;

    @JoinColumn(name = "curso_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Curso cursoId;

    @JoinColumn(name = "periodo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Periodo periodoId;

    @JoinColumn(name = "estudiante_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Estudiante estudianteId;
}

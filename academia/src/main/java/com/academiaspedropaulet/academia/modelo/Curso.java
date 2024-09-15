package com.academiaspedropaulet.academia.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "academia_curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",length = 45, nullable = false)
    private String nombre;

    @JoinColumn(name = "turno_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Turno turnoId;

    @JoinColumn(name = "trabajador_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Trabajador trabajadorId;

    @JoinColumn(name = "grupo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Grupo grupoId;

    @JoinColumn(name = "periodo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Periodo periodoId;

    @Column(name = "promedio_notas",nullable = false)
    private int promedioNotas;
}

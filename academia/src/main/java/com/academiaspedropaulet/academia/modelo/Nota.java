package com.academiaspedropaulet.academia.modelo;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "academia_nota")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nota",nullable = false)
    private int nota;

    @JoinColumn(name = "competencia_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Competencia competenciaId;
}

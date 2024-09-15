package com.academiaspedropaulet.academia.modelo;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "academia_grupo")
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",length = 45, nullable = false)
    private String nombre;

    @JoinColumn(name = "seccion_id",referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Seccion seccionId;

    @JoinColumn(name = "cupo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cupo cupoId;

}

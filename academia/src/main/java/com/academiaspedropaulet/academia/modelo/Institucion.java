package com.academiaspedropaulet.academia.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "academia_institucion")
public class Institucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob // Indica que es un objeto de gran tamaño para imagenes
    private byte[] imagenLogo;

    @Column(name = "nombreInstitucion", length = 45, nullable = false)
    private String nombreInstitucion;

    @Column(name = "lugar", length = 100, nullable = false)
    private String Lugar;

    @Column(name = "mision", length = 500, nullable = false)
    private String mision;

    @Column(name = "vicion", length = 500, nullable = false)
    private String vicion;

    @JoinColumn(name="sede_institucion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sedeinstitucion sedeInstitucionId;

}

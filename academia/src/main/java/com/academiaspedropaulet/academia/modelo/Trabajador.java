package com.academiaspedropaulet.academia.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "academia_trabajador")
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre_completo",length = 45,nullable = false)
    private String nombreCompleto;

    @Column(name = "apellido_paterno",length = 45,nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno",length = 45,nullable = false)
    private String apellidoMaterno;

    @Column(name = "dni",length = 8,nullable = false)
    private String dni;

    @Column(name = "correo",length = 45,nullable = false)
    private String correo;

    @Column(name = "contrasena",length = 100,nullable = false)
    private String contrasena;

    @JoinColumn(name = "Cargo_id",referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cargo cargoId;

    @JoinColumn(name = "institucion_id",referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Institucion institucionId;

    @JoinColumn(name = "estadoTrabajador_id",referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Estadotrabajador estadoTrabajadorId;

    @Column(name = "entrego_cv",length = 2,nullable = false)
    private String entregoCV;

    @Column(name = "celular",nullable = false)
    private int celular;

}

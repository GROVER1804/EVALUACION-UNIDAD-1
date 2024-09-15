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
@Table(name = "academia_estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_completo",length = 200, nullable = false)
    private String nombreCompleto;

    @Column(name = "apellido_paterno",length = 100, nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno",length = 100, nullable = false)
    private String apellidoMaterno;

    @Column(name = "dni",length = 8, nullable = false)
    private String dni;

    @Column(name = "celular", nullable = false)
    private int celular;

    @Column(name = "correo",length = 100, nullable = false)
    private String correo;

    @Column(name = "contrasena",length = 100, nullable = false)
    private String contrasena;

    @JoinColumn(name = "estado_estudiante_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoEstudiante estadoEstudianteId;

    @Column(name = "edad", nullable = false)
    private int edad;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Basic(optional = false)
    @Column(name = "fecha_nac", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNac;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Basic(optional = false)
    @Column(name = "fecha_incorporacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaIncorporacion;

    @Column(name = "lugar_natural",length = 100, nullable = false)
    private String lugarNatural;

    @Column(name = "IEque_estudio",length = 100, nullable = false)
    private String IEqueEstudio;

    @Column(name = "direccion",length = 100, nullable = false)
    private String direccion;

    @Column(name = "a_que_escuela_postula",length = 100, nullable = false)
    private String aQueEscuelaPostula;

    @Column(name = "grado_instruccion",length = 100, nullable = false)
    private String gradoInstruccion;

    @Column(name = "familiar_militar_policial",length = 45, nullable = false)
    private String familiarMilitarPolicial;

    @Column(name = "natacion",length = 2, nullable = false)
    private String natacion;

    @Column(name = "peso", nullable = false)
    private int peso;

    @Column(name = "talla", nullable = false)
    private int talla;

    @Column(name = "otros",length = 45, nullable = false)
    private String otros;

    @Column(name = "nombre_padre",length = 45, nullable = false)
    private String nombrePadre;

    @Column(name = "ocupacion_padre",length = 45, nullable = false)
    private String ocupacionPadre;

    @Column(name = "celular_padre",length = 45, nullable = false)
    private String celularPadre;

    @Column(name = "nombre_madre",length = 45, nullable = false)
    private String nombreMadre;

    @Column(name = "ocupacion_madre",length = 45, nullable = false)
    private String ocupacionMadre;

    @Column(name = "celular_madre",length = 45, nullable = false)
    private String celularMadre;

    @Column(name = "ante_pato_psico",length = 100, nullable = false)
    private String antePatoPsico;

    @Column(name = "ante_poli_judi",length = 100, nullable = false)
    private String antePoliJudi;

    @Column(name = "declaracion_jurada",length = 2, nullable = false)
    private String declaracionJurada;

    @JoinColumn(name = "medioInteres_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MedioInteres medioInteresId;
}

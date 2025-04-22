package com.guarderia.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "matricula")  
public class Matricula implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private Integer idMatricula;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    private String correo;
    private String telefono;
    private int edad;
    private String curso;

    @Enumerated(EnumType.STRING)
    @Column(name = "genero")
    private Genero genero;

    public enum Genero {
        Hombre,
        Mujer
    }

    public Matricula() {
    }

    public Matricula(String nombreCompleto, String correo, String telefono, int edad, Genero genero, String curso) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.genero = genero;
        this.curso = curso;
    }
}

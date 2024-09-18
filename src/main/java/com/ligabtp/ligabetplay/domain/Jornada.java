package com.ligabtp.ligabetplay.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jornadas")
public class Jornada {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;


    @Column(length = 100, name = "fechainicio_jornada")
    private Date fechaInicioJornadas;

    @Column(length = 100, name = "fechafin_jornada")
    private Date fechaFinJornadas;

    @Column(length = 100, name = "numero_jornada")
    private String numeroJornada;

    @ManyToOne
   @JoinColumn (name = "id_partido", referencedColumnName = "id_partido", nullable = false)
   private Partido partido;
}

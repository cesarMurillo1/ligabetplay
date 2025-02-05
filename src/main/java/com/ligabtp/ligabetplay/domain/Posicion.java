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
@Table(name = "posiciones")
public class Posicion {


    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(length = 100)
    private Date fecha_posicion;

    @Column(length = 100)
    private String resultado_posicion;

    @ManyToOne
    @JoinColumn (name = "partido_posicion", referencedColumnName = "id_partido", nullable = false)
    private Partido partido;

    @ManyToOne
    @JoinColumn (name = "equipo_posicion", referencedColumnName = "id_equipo", nullable = false)
    private Equipo equipo;
}